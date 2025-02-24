package JDBC;

import java.sql.*;

public class Task1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "Amudhu@2020";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertSQL)) {
                stmt.setString(1, "John Doe");
                stmt.setInt(2, 22);
                stmt.executeUpdate();
            }

            String selectSQL = "SELECT * FROM students";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
                }
            }

            String updateSQL = "UPDATE students SET age = ? WHERE name = ?";
            try (PreparedStatement stmt = conn.prepareStatement(updateSQL)) {
                stmt.setInt(1, 23);
                stmt.setString(2, "John Doe");
                stmt.executeUpdate();
            }

            String deleteSQL = "DELETE FROM students WHERE name = ?";
            try (PreparedStatement stmt = conn.prepareStatement(deleteSQL)) {
                stmt.setString(1, "Ram");
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
