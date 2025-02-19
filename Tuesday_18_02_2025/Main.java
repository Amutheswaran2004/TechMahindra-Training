import java.util.Scanner;
import  java.sql.*;
public class Main {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        CRUD_Operation operation =new CRUD_Operation("jdbc:mysql://localhost:3306/OnlineShopping","root","Amudhu@2020");
        sc=new Scanner(System.in);
        System.out.println("Enter your Choice :\n1.)Insert a Record\n2.)Select a Record\n3.)Delete a Record");
        int choice=sc.nextInt();
        switch (choice){
            case 1:{
                operation.insertRecord(sc);
                break;
            }
            case 2:{
                operation.selectRecords(sc);
                break;
            }
            case 3:{
                operation.deleteRecord(sc);
                break;
            }
            case 4:{
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }

        }

    }
    }
