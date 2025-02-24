package ExceptionalHandling.Task2;
//2. Write a Java program to create a method that takes an integer as a parameter and
// throws an exception if the number is odd.

public class Task_2 {

    public static void numberCheck(int num)throws OddCheckException{
     if(num%2!=0){
         throw new OddCheckException("The Number "+num+" is odd");
     }
     else{
         System.out.println("The Number "+num+" is even");
     }
    }
    public static void main(String[] args) {
        System.out.println("Execution Started");
   int a=17;
   try {
       numberCheck(a);
   }catch(OddCheckException e){
       System.err.println(e.getMessage());
   }
        System.out.println("Execution Ended");
    }

}
