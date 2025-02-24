package ExceptionalHandling;
//Write a Java program that reads a list of numbers from a file and
//throws an exception if any of the numbers are positive
import java.io.*;
import java.util.Scanner;
public class Task_4 {

        public static void readFile(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("Error: File " + fileName + " not found.");
            } else {
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNext()) {
                        if (scanner.hasNextInt()) {
                            int number = scanner.nextInt();
                            if (number > 0) {
                                throw new IllegalArgumentException("Error: Positive number " + number + " found in file.");
                            }
                            System.out.println(number);
                        } else {
                            scanner.next();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                }
            }
        }

        public static void main(String[] args) {
            String fileName = "C:\\Users\\Amutheswaran\\IdeaProjects\\Core Java Consolidate Task\\src\\ExceptionalHandling\\demo.txt";
            try {
                readFile(fileName);
            } catch (FileNotFoundException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

