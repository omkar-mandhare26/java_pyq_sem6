package apr2022;

import java.sql.*;

public class q3e {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "root@123");

            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate("DELETE FROM emp WHERE ename LIKE 'A%'");

            System.out.println("Deleted records: " + rows);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
