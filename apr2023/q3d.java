package apr2023;

public class q3d {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello Java");
                Thread.sleep(500);
            }
        } catch (InterruptedException err) {
        }
    }
}
