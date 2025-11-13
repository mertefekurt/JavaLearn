import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Module09_FileIOAndStreams {
    public static void main(String[] args) {
        String fileName = "test_file.txt";
        String content = "Hello, World!\nThis is a test file.\nJava File I/O example.";
        
        try {
            writeToFile(fileName, content);
            System.out.println("File written successfully");
            
            String readContent = readFromFile(fileName);
            System.out.println("File content:\n" + readContent);
            
            appendToFile(fileName, "\nAppended line.");
            System.out.println("Line appended");
            
            List<String> lines = readLinesFromFile(fileName);
            System.out.println("Total lines: " + lines.size());
            for (String line : lines) {
                System.out.println("  > " + line);
            }
            
            String dataFile = "data.txt";
            writeNumbersToFile(dataFile, Arrays.asList(10, 20, 30, 40, 50));
            System.out.println("Numbers written to file");
            
            List<Integer> numbers = readNumbersFromFile(dataFile);
            System.out.println("Numbers read: " + numbers);
            
            String copyFile = "copy_of_data.txt";
            copyFile(fileName, copyFile);
            System.out.println("File copied successfully");
            
            boolean exists = fileExists(fileName);
            System.out.println("File exists: " + exists);
            
            long fileSize = getFileSize(fileName);
            System.out.println("File size: " + fileSize + " bytes");
            
            List<String> fileList = listFilesInDirectory(".");
            System.out.println("Files in current directory:");
            for (String file : fileList) {
                System.out.println("  - " + file);
            }
            
            cleanupTestFiles(fileName, dataFile, copyFile);
            System.out.println("Test files cleaned up");
            
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }
    
    static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            writer.write(content);
        }
    }
    
    static String readFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    
    static void appendToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(fileName), StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write(content);
        }
    }
    
    static List<String> readLinesFromFile(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
    
    static void writeNumbersToFile(String fileName, List<Integer> numbers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Integer num : numbers) {
                writer.println(num);
            }
        }
    }
    
    static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }
    
    static void copyFile(String source, String destination) throws IOException {
        Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
    }
    
    static boolean fileExists(String fileName) {
        return Files.exists(Paths.get(fileName));
    }
    
    static long getFileSize(String fileName) throws IOException {
        return Files.size(Paths.get(fileName));
    }
    
    static List<String> listFilesInDirectory(String dirPath) throws IOException {
        return Files.list(Paths.get(dirPath))
                .filter(Files::isRegularFile)
                .map(p -> p.getFileName().toString())
                .collect(Collectors.toList());
    }
    
    static void cleanupTestFiles(String... fileNames) {
        for (String fileName : fileNames) {
            try {
                Files.deleteIfExists(Paths.get(fileName));
            } catch (IOException e) {
                System.err.println("Error deleting " + fileName + ": " + e.getMessage());
            }
        }
    }
}

