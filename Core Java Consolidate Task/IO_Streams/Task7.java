package IO_Streams;

import java.util.Scanner;

//7.)Write a Java program to read input from the Java console
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Name : ");
        String fname = sc.nextLine();

        System.out.print("Enter your Last Name: ");
        String lname = sc.nextLine();

        System.out.println("Hello, "+fname+" "+lname);

    }

}
