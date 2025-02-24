package IO_Streams;

import java.io.BufferedReader;
import java.io.FileReader;

//10.) Write a Java program to read file content line by line
public class Task_10 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Amutheswaran\\IdeaProjects\\Core Java Consolidate Task\\src\\IO_Streams\\Content.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line ;
            System.out.println("File Content Read by Line by Line : ");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
