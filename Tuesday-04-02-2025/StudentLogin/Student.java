import java.util.*;
public class Student {
    private String name;
   private String email;
    List<Courses> list;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
