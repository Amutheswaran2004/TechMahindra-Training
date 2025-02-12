package Serialization.Reference;

import java.io.Serializable;
//Create a class Employee with fields Eno , Ename and email.
// Serialize the object of the class, without email field, store it,
// deserialize it and display the values
public class Employee implements Serializable {
    int Eno;
    String Ename;
    transient String email;

    public Employee(int eno, String ename, String email) {
        Eno = eno;
        Ename = ename;
        this.email = email;
    }
}
