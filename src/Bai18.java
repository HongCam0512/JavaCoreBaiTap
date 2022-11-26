import java.util.Random;
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Hay nhap vao mot so");
        x= scanner.nextInt();
        if (x > generator.nextInt(1000)) {
            System.out.println("Ban dang nhap so lon hon so bi mat");
        }
        if (x < generator.nextInt(1000)) {
            System.out.println("Ban dang nhap so nho hon so bi mat");
        }
        if (x == generator.nextInt(1000)) {
            System.out.println("Ban da nhap dung");
        }

    }
}
