package nov2023;

import java.util.*;
import java.sql.*;

public class q2e {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root@123");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Patient ID: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Patient Name: ");
            String pname = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            String query = "INSERT INTO patient VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pid);
            ps.setString(2, pname);
            ps.setInt(3, age);
            ps.setString(4, disease);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) affected");

            con.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
