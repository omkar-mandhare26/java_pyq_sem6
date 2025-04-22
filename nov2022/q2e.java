package nov2022;

import java.sql.*;

public class q2e {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "root@123";

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            int count = 0;
            while (rs.next()) {
                count++;
            }

            System.out.println("Total records: " + count);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
