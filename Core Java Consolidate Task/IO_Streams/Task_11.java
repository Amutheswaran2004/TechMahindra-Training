package IO_Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//11.)Write a Java program to read a plain text file.
public class Task_11 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Amutheswaran\\IdeaProjects\\Core Java Consolidate Task\\src\\IO_Streams\\Content.txt";

        try{
            List<String> lineList = Files.readAllLines(Paths.get(path));
            System.out.println("File content:");
            for (String line : lineList) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

}
