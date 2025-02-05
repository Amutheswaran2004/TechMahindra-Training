import java.util.*;
public class Database {
    Student student;
    List<Student> Base=new ArrayList<>();
    public Student fetch(String name,String email) {

        return student;
    }
    public boolean checkUp(String name,String email){
     for(Student obj:Base){
                  if(name.equals(obj.getName()) && email.equals(obj.getEmail())){
             student=obj;
             return true;
         }

     }
     return false;
    }
}
