package nov2022;

public class q3d {
    public static void main(String[] args) {
        try {

            for (int i = 100; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }

        } catch (InterruptedException err) {
        }
    }
}
