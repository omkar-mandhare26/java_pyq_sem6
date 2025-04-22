package nov2022;

import java.sql.*;

public class q3e {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root@123");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE student(rno int, sname varchar(50), per decimal(5,2))");

            System.out.println("Table create");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
