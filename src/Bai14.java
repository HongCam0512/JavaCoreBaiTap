import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Nhap so phan tu mangn: ");
        n = scanner.nextInt();
        } while (n<=0);
        a = new int[n];
        nhap(a,n);
        System.out.println("Mang da nhap la: ");
        xuat(a,n);

        System.out.println("Gia tri trung binh cua mang la: " +average(a,n));
        System.out.println("Phan tu lon nhat la: " +max(a,n));
        System.out.println("Phan tu nho nhat la: " +min(a,n));
        minNegative(a,n);
        maxNegative(a,n);
        minPositive(a,n);
        maxPositive(a,n);
        print(a,n);
        //chenPhanTu(a,n);
        xoaPhanTu(a,n);

    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();

    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.println(a[i] + " ");
    }
    public static double average(int a[],int n){
        int sum = 0;
        double tb =0;
        for (int i=0;i<n;i++){
            sum = sum + a[i];
        }
        tb = sum/n;
        return tb;
    }
    public static int min(int a[],int n){
        int min = a[0];
        for (int i=1;i<n;i++){
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static int max(int a[],int n){
        int max = a[0];
        for (int i=1;i<n;i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void minNegative(int a[],int n){
        int temp=0, min = 0;
       for (int i=0;i<n;i++){
            if (a[i] < 0) {
                temp++;
                min = a[i];
                break;
            }
        }
       if (temp == 0) {
           System.out.println("Mang khong co phan tu am");
           return;
       }
        for (int i=0;i<n;i++) {
            if (a[i]<0 && a[i]< min) {
                min = a[i];
            }
        }
        System.out.println("So nguyen am nho nhat la: " +min);
    }
    public static void maxNegative(int a[],int n){
        int temp=0, max = 0;
        for (int i=0;i<n;i++){
            if (a[i] < 0) {
                temp++;
                max = a[i];
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Mang khong co phan tu am");
            return;
        }
        for (int i=0;i<n;i++) {
            if (a[i]<0 && a[i]> max) {
                max = a[i];
            }
        }
        System.out.println("So nguyen am lon nhat la: " +max);
    }
    public static void minPositive(int a[],int n){
        int temp=0, min = 0;
        for (int i=0;i<n;i++){
            if (a[i] > 0) {
                temp++;
                min = a[i];
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Mang khong co phan tu duong");
            return;
        }
        for (int i=0;i<n;i++) {
            if (a[i]>0 && a[i]< min) {
                min = a[i];
            }
        }
        System.out.println("So nguyen duong nho nhat la: " +min);
    }
    public static void maxPositive(int a[],int n){
        int temp=0, max = 0;
        for (int i=0;i<n;i++){
            if (a[i] > 0) {
                temp++;
                max = a[i];
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Mang khong co phan tu duong");
            return;
        }
        for (int i=0;i<n;i++) {
            if (a[i]>0 && a[i]> max) {
                max = a[i];
            }
        }
        System.out.println("So nguyen duong lon nhat la: " +max);
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
        System.out.println("Phan tu chan trong mang la: ");
        for (int i = 0; i < j; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Phan tu le trong mang la: ");
        for (int i = 0; i < x; i++) {
            System.out.println(c[i]);
        }
    }
    public static void chenPhanTu(int a[], int n) {
        int phanTu, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri phan tu can chen: ");
        phanTu = scanner.nextInt();
        do {
            System.out.print("Nhap vi tri can chen:");
            k = scanner.nextInt();
        } while (k<0);
        if (k>n) k=n;
        int[] b = new int[n+1];
        for (int i =0; i<a.length;i++) b[i]=a[i];
        b[k]=phanTu;
        for (int i =k+1; i<=a.length; i++) {
            b[i] = a[i-1];
        }
        System.out.print("Mang da chen phan tu:");
        for (int i =0; i<b.length;i++) {
            System.out.print(" "+b[i]);
        }
    }
    public static void xoaPhanTu(int a[], int n) {
        int k;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vi tri can xoa:");
            k = scanner.nextInt();
        } while (k<0);
        if (k>n) k=n;
        int[] b = new int[n-1];
        for (int i =k; i<a.length-1; i++) {
            a[i] = a[i+1];
        }
        System.out.print("Mang da xoa phan tu:");
        for (int i =0; i<a.length -1;i++) {
            System.out.print(" "+a[i]);
        }
    }
}
