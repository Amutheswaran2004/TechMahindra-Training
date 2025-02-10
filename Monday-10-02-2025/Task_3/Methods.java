package Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Methods {
    static void ScannerClass ()
    {
        // Using Scanner for Getting Input from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = sc.nextLine();
        System.out.println("You entered string " + s1);

        System.out.println("Enter the input integer :");
        int a = sc.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter the input float :");
        float b = sc.nextFloat();
        System.out.println("You entered float " + b);
    }
    static void BufferReaderClass() throws IOException
    {
        // Enter data using BufferReader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        // Reading data using readLine
        String str = br.readLine();

        // Printing the read line
        System.out.println("The given input:" + str);
    }

}
