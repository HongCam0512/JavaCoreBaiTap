import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2,d=0;
        System.out.println("Nhap vao toa do cua diem A");
        System.out.print("x1 = "); x1 = scanner.nextDouble();
        System.out.print("y1 = "); y1 = scanner.nextDouble();

        System.out.println("Nhap vao toa do cua diem B");
        System.out.print("x2 = "); x2 = scanner.nextInt();
        System.out.print("y2 = "); y2 = scanner.nextInt();

        if (x1 == 0 && x2 == 0) {
            d = Math.abs(y1) + Math.abs(y2);
        }
        if (y1 == 0 && y2 == 0) {
            d = Math.abs(x1) + Math.abs(x2);
        }
        double x, y;
        x = Math.sqrt(x1*x1 + y1*y1);
        y = Math.sqrt(x2*x2 + y2*y2);
        d = x + y;
        System.out.println("Chieu dai doan AB la: " + d);
    }
}
