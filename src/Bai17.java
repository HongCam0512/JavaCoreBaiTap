import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam can kiem tra: ");
        year = scanner.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("La nam nhuan");
            } else {
                System.out.println("Khong phai nam nhuan");
            }
        } else if(year % 4 == 0){
            System.out.println("La nam nhuan");
        } else {
            System.out.println("Khong phai nam nhuan");
        }
    }
}
