import java.sql.*;
import java.util.Scanner;

public class CRUD_Operation {
    String url;
    String username;
    String password;

    public void insertRecord(Scanner sc) throws SQLException {
        System.out.println("Enter your First Name :");
        String first_name = sc.next();
        System.out.println("Enter your Last Name : ");
        String last_name = sc.next();
        System.out.println("Enter your Email : ");
        String email = sc.next();
        System.out.println("Enter your Hashed Password : ");
        String password_hash = sc.next();
        Users obj = new Users(first_name, last_name, email, password_hash);
        String query = "INSERT INTO Users (first_name, last_name, email, password_hash) VALUES (?, ?, ?, ?)";
        try (Connection connect = DriverManager.
                getConnection(url, username, password);
             PreparedStatement mystm = connect.prepareStatement(query)) {

            // Set values for the placeholders
            mystm.setString(1, obj.getFirst_name());
            mystm.setString(2, obj.getLast_name());
            mystm.setString(3, obj.getEmail());
            mystm.setString(4, obj.getPassword_hash());
            int row = mystm.executeUpdate();
            System.out.println("Number of rows affected:"
                    + row);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void selectRecords(Scanner sc) throws SQLException {
        System.out.println("Enter your Email id :");
        String conformation = sc.next();
        String query = "select * from users where email=?";
        //Step 1 - connect database
        try (Connection connection = DriverManager.
                getConnection(url, username, password);
             //Step 2 - Creating statement
             PreparedStatement pstmt = connection.prepareStatement(query);) {
            pstmt.setString(1, conformation);
            //Step 3 - Executing query and Processing resultset
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.print("\nFirst Name is:" + rs.getString(2));
                System.out.print("\nLast Name is:" + rs.getString(3));
                System.out.print("\nEmail is:" + rs.getString(4));
                System.out.print("\nHashed Password is:" + rs.getString(5));
            } else {
                System.err.println("Email Not Found");
            }
            //Step 4 - Close connection
            connection.close();
        } catch (SQLException a) {
            a.printStackTrace();
        }
    }

    public void deleteRecord(Scanner sc) throws SQLException {
        System.out.println("Enter your Email id :");
        String conformation = sc.next();
        String query = "delete  from users where email= ? ";
        //Step 1 - connect database
        try (Connection connection = DriverManager.
                getConnection(url, username, password);
             //Step 2 - Creating statement
             PreparedStatement pstmt = connection.prepareStatement(query);) {
            pstmt.setString(1, conformation);
            //Step 3 - Executing query and Processing resultset
            int rs = pstmt.executeUpdate();
            if(rs==0){
                System.out.println("Email not found");
            }
            else{
                System.out.println("Record deleted Successfully");
            }
        }
    }

    public CRUD_Operation(String url, String username, String password) {
            this.url = url;
            this.username = username;
            this.password = password;
        }
    }

