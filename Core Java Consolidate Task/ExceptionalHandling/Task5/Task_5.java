package ExceptionalHandling.Task5;
//Write a Java program that reads a file and throws an exception if the file is empty

import java.io.*;
public class Task_5 {


        public static void readFile(String fileName) throws  IOException,FileEmpty {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new IOException("Error: File " + fileName + " not found.");
            } else if (file.length() == 0) {
                throw new FileEmpty("Error: File " + " is empty.");
            } else {
                try (FileReader fr = new FileReader(file)) {
                    int character;
                    while ((character = fr.read()) != -1) {
                        System.out.print((char) character);
                    }
                }
            }
        }

        public static void main(String[] args) {
            System.out.println("Execution Started");
            String fileName = "C:\\Users\\Amutheswaran\\IdeaProjects\\Core Java Consolidate Task\\src\\ExceptionalHandling\\demo2.txt"; // Change this to test with different files
            try {
                readFile(fileName);
            } catch (IOException | FileEmpty e) {
                System.err.println(e.getMessage());
            }
            System.out.println("Execution Ended");
        }


}
