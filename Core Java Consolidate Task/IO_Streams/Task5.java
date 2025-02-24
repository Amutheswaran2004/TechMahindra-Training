package IO_Streams;

import java.io.File;

//5.) Write a Java program to check if the given pathname
// is a directory or a file.
public class Task5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Amutheswaran\\IdeaProjects\\Core Java Consolidate Task\\src\\IO_Streams";

        File fileOrDirectory = new File(path);
        if(fileOrDirectory.exists()){
            if(fileOrDirectory.isDirectory()){
                System.out.println("The File Path mentioned Above is Directory");
            }
            if(fileOrDirectory.isFile()){
                System.out.println("The File Path mentioned Above is A File!");
            }
        }
        else{
            System.out.println("No Directory Exists");
        }
    }

}
