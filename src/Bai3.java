import java.util.Scanner;

public class Bai3 {
    public static void convertThapPhanToNhiPhan(int x) {
        int nhiPhan[] = new int[30];
        int thuTu = 0;
        while(x > 0){
            nhiPhan[thuTu++] = x%2;
            x = x/2;
        }
        for(int i = thuTu-1; i >= 0; i--){
            System.out.print(nhiPhan[i]);
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so thap phan can chuyen: ");
            a = scanner.nextInt();
        } while(a<0);
        System.out.println("Giá trị nhị phân là: " +Integer.toBinaryString(a));
        System.out.println("Giá trị nhị phân là: ");
        convertThapPhanToNhiPhan(a)
        ;
    }

}
