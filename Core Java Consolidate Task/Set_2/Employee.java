package Set_2;

import java.util.Scanner;

public class Employee {
    private int emp_id;
    private String emp_Name;
    private double sal;

 public void getEmployeeDetails(){
     System.out.println("Employee Name :"+this.emp_Name);
     System.out.println("Employee Id :"+this.emp_id);
     System.out.println("Employee Salary :"+this.sal);

 }
 public void setEmployeeDetails(String emp_Name,int emp_id,double sal){
     this.emp_Name=emp_Name;
     this.emp_id=emp_id;
     this.sal=sal;
     System.out.println("Details Saves Successfully");
 }
 public void getLoanEligibility(){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of years worked by the employee :");
     int exp=sc.nextInt();
     if(exp>5){
        if(this.sal>=15_00_000){
            System.out.println("You are able to get 7 lakhs of loan amount ");
        }
        else if(this.sal>=10_00_000){
            System.out.println("You are able to get 5 lakhs of loan amount ");
        }
        else if(this.sal>6_00_000){
             System.out.println("You are able to get 2 lakhs of loan amount ");
         }
        else{
            System.out.println("This is Employee not eligible for the loan");
        }
     }
     else{
         System.out.println("This is Employee not eligible for the loan");
     }

  }
}
