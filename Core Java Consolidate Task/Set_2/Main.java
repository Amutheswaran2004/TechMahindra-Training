package Set_2;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.setEmployeeDetails("Amudesh",19481290,10_00_000);
        emp2.setEmployeeDetails("Gowtham",19481291,15_00_000);
        emp3.setEmployeeDetails("Karthick",19481292,4_00_000);

        emp1.getEmployeeDetails();
        emp1.getLoanEligibility();
    }
}
