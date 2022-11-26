import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        int[] a;
        int n, x=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so phan tu mangn: ");
            n = scanner.nextInt();
        } while (n <= 0);
        a = new int[n];
        nhap(a, n);
        System.out.println("Mang da nhap la: ");
        xuat(a, n);
        for (int i= 0; i<a.length;i++) {
            for (int j =i+1; j<a.length-1;j++) {
                if (a[i] == a[j]) {
                    a[j] =a[j+1];
                    x++;
                }
            }
        }
        System.out.println("Mang da loc:");
        xuat(a,n-x);
    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();

    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
    }
}
