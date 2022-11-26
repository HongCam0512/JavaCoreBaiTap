import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        System.out.println("Hay nhap lua chon cua ban:");
        System.out.println("1-Giai phuong trinh bac nhat");
        System.out.println("2-Giai phuong trinh bac hai");
        luaChon = scanner.nextInt();
        while (luaChon!= 1 && luaChon!= 2) {
            System.out.println("Hay nhap lai lua chon");
            luaChon = scanner.nextInt();
        }
        switch (luaChon) {
            case 1: giaiPtBacNhat();
            break;
            case 2: giaiPtBacHai();
            break;
        }
    }
    public static void giaiPtBacNhat() {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap he so a =:");
        a = scanner.nextFloat();
        System.out.println("Nhap he so b =:");
        b = scanner.nextFloat();
        if (a==0) {
            if (b==0) System.out.println("Phuong trinh vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        } else System.out.println("Phuong trinh co nghiem la" +(-b/a));
    }
    public static void giaiPtBacHai() {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, delta;
        double x1, x2;
        System.out.println("Nhap he so a =:");
        a = scanner.nextFloat();
        System.out.println("Nhap he so b =:");
        b = scanner.nextFloat();
        System.out.println("Nhap he so c =:");
        c = scanner.nextFloat();

        if (a==0) {
            if (b==0) {
                if (c==0) System.out.println("Phuong trinh vo so nghiem");
                else System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat: "+(-c/b));
            }
        } else {
            delta = b*b - 4*a*c;
            if (delta >0) {
                x1 = ((-b +Math.sqrt(delta))/(2*a));
                x2 = ((-b -Math.sqrt(delta))/(2*a));
                System.out.println("Nghiem thu nhat la: "+x1);
                System.out.println("Nghiem thu hai la: "+x2);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: "+(-b/2*a));
            } else System.out.println("Phuong trinh vo nghiem");
        }
    }
}
