package apr2023;

import java.sql.*;

public class q3e {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "root@123";

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate("DELETE FROM emp WHERE eno=1");

            System.out.println(rows + " row(s) affected");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
