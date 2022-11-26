import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so phan tu mang: ");
            n = scanner.nextInt();
        } while (n<=0);
        a = new int[n];
        nhap(a,n);
        System.out.println("Mang da nhap la: ");
        xuat(a,n);
        print(a,n);
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
    public static void print(int a[],int n) {
        int[] b = new int[n];
        int[] c = new int[n];
        int j = 0, x = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            } else {
                c[x] = a[i];
                x++;
            }
        }
        System.out.println("\nPhan tu chan trong mang la: ");
        for (int i = 0; i < j; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nPhan tu le trong mang la: ");
        for (int i = 0; i < x; i++) {
            System.out.print(c[i]+ " ");
        }
    }
}
