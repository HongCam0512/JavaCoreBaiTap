import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Hay nhap so nguyen a = ");
            a = scaner.nextInt();
        } while(a<=0);
        System.out.println("Cac uoc so cua so nguyen a la:");
        for (int i=1; i<=a; i++) {
            if (a%i == 0) {
                System.out.print(" " +i);
            }
        }
    }
}
