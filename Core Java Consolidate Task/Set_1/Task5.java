package Set_1;

import java.util.Scanner;

//5.)You are required to create a string and captialize every alternative character.
// for eg : if the input is anurag then output should be AnUrAg
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");

        String input = sc.next().toLowerCase();
        char[] output = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char CurrentChar = input.charAt(i);
            if (i % 2 == 0) {
                CurrentChar -= 32;
            }
            output[i] = CurrentChar;
        }
        System.out.println("Final Output :" + String.valueOf(output));
    }

}
