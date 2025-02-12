package Serialization.Reference;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Drive {
    public static void serialize(Employee obj)throws IOException
    {
        FileOutputStream file = new FileOutputStream("Storage.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(obj);
        out.flush();
        out.close();
        System.out.println("Object Stored successfully");
    }
    public static void deserialize(String path) throws IOException, ClassNotFoundException
    {
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(file);
        Employee obj=(Employee) in.readObject();
        System.out.println("Employee Details :\n Name:"+obj.Ename+"\n Employee Number:"+obj.Eno);
    }
    public static void main(String[] args)
    {
        try {
            serialize(new Employee(367,"Amutheswaran M","amudheswaran@gmail.com"));
            deserialize("Storage.txt");
        }catch (Exception e){e.printStackTrace();}
    }
}
