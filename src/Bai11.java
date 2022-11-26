import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum=0, count=0;
        do {
            System.out.print("Hay nhap so nguyen n: ");
            n = scanner.nextInt();
        } while (n<0);
        for (int i=2; i<=n; i++) {
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    count ++;
                }
            }
            if (count == 0) {
                sum = sum + i;
            }
             count = 0;
        }
        System.out.println("Tong cac so nguyen to tu 1 den n la: " +sum);
    }
}
