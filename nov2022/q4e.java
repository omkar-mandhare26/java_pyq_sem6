package nov2022;

import java.net.*;

public class q4e {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
