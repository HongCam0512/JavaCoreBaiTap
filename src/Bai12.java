import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Hay nhap so nguyen n = ");
            n = scanner.nextInt();
        } while (n<0);
        for (int i=n; i>=0; i--) {
            if (i < lg(n)) {
                System.out.println("So can tim la: " + i);
                break;
            }
        }
    }
    public static double lg(int x) {
        return Math.log(x)/Math.log(2);
    }
}
