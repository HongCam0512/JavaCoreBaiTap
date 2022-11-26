import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        do {
            System.out.print("Nhap so a = ");
            a = scanner.nextInt();
        } while (a<10 || a>99);
        do {
            System.out.print("Nhap so b = ");
            b =  scanner.nextInt();
        } while (b<10 || b>99);
        int[] c = new int[2];
        int[] d = new int[2];
        c[0] = a/10; c[1] = a%10;
        d[0] = b/10; d[1] = b%10;
        if (c[0] == d[0] || c[0] == d[1] || c[1] == d[0] || c[1] == d[1]) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
