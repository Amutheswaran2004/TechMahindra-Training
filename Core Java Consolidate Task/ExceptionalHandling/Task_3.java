package ExceptionalHandling;
//Write a Java program to create a method that reads a file and
// throws an exception if the file is not found
import java.io.*;
public class Task_3 {

    public static void readFile(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                try (FileReader fr = new FileReader(file)) {
                    int character;
                    while ((character = fr.read()) != -1) {
                        System.out.print((char) character);
                    }
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                }
            }
        }

        public static void main(String[] args) {
            System.out.println("Execution Stared");
            String fileName = "demo.txt";
            try {
                readFile(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Execution Ended");
        }
    }



