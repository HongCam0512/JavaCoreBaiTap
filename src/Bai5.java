import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int a, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Hay nhap so tu nhien n: ");
            a = scanner.nextInt();
        }while(a<0);

        while (a>0) {
            sum = sum + a%10;
            a =a/10;
        }
        System.out.println("Tong cua so tu nhien la: " +sum);

    }
}
