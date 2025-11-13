import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Module10_MultithreadingAndConcurrency {
    private static int counter = 0;
    private static final AtomicInteger atomicCounter = new AtomicInteger(0);
    private static final Object lock = new Object();
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Thread Basics ===");
        Thread thread1 = new Thread(new SimpleTask("Task-1"));
        Thread thread2 = new Thread(new SimpleTask("Task-2"));
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println("\n=== Thread with Lambda ===");
        Thread lambdaThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Lambda thread: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        lambdaThread.start();
        lambdaThread.join();
        
        System.out.println("\n=== Synchronized Counter ===");
        Counter sharedCounter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final counter value: " + sharedCounter.getValue());
        
        System.out.println("\n=== Atomic Counter ===");
        Thread at1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.incrementAndGet();
            }
        });
        Thread at2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.incrementAndGet();
            }
        });
        
        at1.start();
        at2.start();
        at1.join();
        at2.join();
        System.out.println("Final atomic counter value: " + atomicCounter.get());
        
        System.out.println("\n=== ExecutorService ===");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);
        
        System.out.println("\n=== Future and Callable ===");
        ExecutorService futureExecutor = Executors.newSingleThreadExecutor();
        Future<Integer> future = futureExecutor.submit(() -> {
            Thread.sleep(1000);
            return 42;
        });
        
        try {
            System.out.println("Waiting for result...");
            Integer result = future.get(2, TimeUnit.SECONDS);
            System.out.println("Future result: " + result);
        } catch (TimeoutException e) {
            System.out.println("Task timed out");
        } catch (ExecutionException e) {
            System.out.println("Task execution failed");
        }
        futureExecutor.shutdown();
        
        System.out.println("\n=== CountDownLatch ===");
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            final int workerId = i;
            new Thread(() -> {
                System.out.println("Worker " + workerId + " started");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Worker " + workerId + " finished");
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("All workers completed");
        
        System.out.println("\n=== Producer-Consumer with BlockingQueue ===");
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}

class SimpleTask implements Runnable {
    private String name;
    
    SimpleTask(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " - iteration: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class Counter {
    private int value = 0;
    
    synchronized void increment() {
        value++;
    }
    
    synchronized int getValue() {
        return value;
    }
}

