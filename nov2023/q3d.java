package nov2023;

import java.sql.*;

public class q3d {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root@123");
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate("DELETE FROM student WHERE sname like 'M%'");

            System.out.println(rows + " row(s) affected");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
