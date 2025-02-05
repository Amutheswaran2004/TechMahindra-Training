package One_Piece.StudentLogin;

import java.util.Scanner;
public class Main {
    static Database data=new Database();
   static Scanner sc;
        public static void Login(){
        System.out.println("Enter your Name :");
        String name=sc.nextLine();
        System.out.println("Enter your Email :");
        String email=sc.nextLine();

        if(data.checkUp(name,email)){
            System.out.println("Login Successfully");
          Student student =data.fetch(name,email);
          menu(student);
        }
            else{
            System.out.println("Invalid Credential");
            }
        }
 public static void menu(Student student){
     System.out.println("Select the Option :\n1.)Rename\n2.)Email-Change\n3.)Buy Course");
     int c2=sc.nextInt();
     switch(c2){
         case 1:{
             System.out.println("Enter the Name :");
             sc.nextLine();
             String name=sc.nextLine();
             System.out.println("Name changed from "+student.getName()+"to"+name);
             student.setEmail(name);
             break;
         }
         case 2:{
             System.out.println("Enter the Email :");
             sc.nextLine();
             String email=sc.nextLine();
             System.out.println("Email changed from "+student.getEmail()+" to "+email);
             student.setEmail(email);
             break;
         }
         case 3:  {
             System.out.println("Here are the list of courses \n1.)Java Full Stack\n 2.)Web-Designing\n3.)AIML");
             break;
         }
         default:{
             System.out.println("Invalid selection");
         }

     }
 }
    public static void SignUp(){
        System.out.println("Enter your Name :");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter your Email :");
        String email=sc.nextLine();
        data.Base.add(new Student(name,email));
        System.out.println("ID created Successfully");
        Login();
    }
    public static void main(String[] args) {
        System.out.println("Welcome, choose the option :\n1.)Login\n2.)Sign Up");
        sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        switch (c1) {
            case 1: {
                  Login();
                  break;
            }
            case 2: {
                SignUp();
                break;
            }
            default:{
                System.out.println("Invalid Choice");
            }

        }
    }
}
