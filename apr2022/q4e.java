package apr2022;

import java.sql.*;

public class q4e {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM emp WHERE department = 'computer application'");

            while (rs.next()) {
                System.out.println("Employee Number: " + rs.getInt("eno"));
                System.out.println("Employee Name: " + rs.getString("ename"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Salary: " + rs.getDouble("sal"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
