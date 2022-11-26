import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, v1, x2, v2, i=0;
        do {
            System.out.println("Hay nhap x1 =");
            x1 = scanner.nextInt();
        } while (x1<0 || x1>1000);
        do {
            System.out.println("Hay nhap v1 =");
            v1 = scanner.nextInt();
        } while (v1<0 || v1>1000);
        do {
            System.out.println("Hay nhap x2 =");
            x2 = scanner.nextInt();
        } while (x2<0 || x2>1000);
        do {
            System.out.println("Hay nhap v2 =");
            v2 = scanner.nextInt();
        } while (v2<0 || v2>1000);
        do {
            x1 +=v1;
            x2 +=v2;
            i++;
        } while (x1!=x2);
        System.out.println("Sau "+i+"lan nhay thi 2 con kangaroo se gap nhau");
    }
}
