import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, temp =1;
        do {
            System.out.println("Hay nhap so nguyen n = ");
            n = scanner.nextInt();
        } while (n<1 || n>9);
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(temp);
                temp++;
            }
            temp=1;
            System.out.print("\n");
        }
    }
}
