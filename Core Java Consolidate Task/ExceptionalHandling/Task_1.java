package ExceptionalHandling;
//1. Write a Java program that throws an exception and catch it using a try-catch block.

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Execution Started");
        int num1=25;
        int num2=0;
        try{
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Execution Ended");
    }

}
