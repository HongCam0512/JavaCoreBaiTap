import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int index;
        System.out.println("Nhap vao mot chuoi");
        string = scanner.nextLine();
        System.out.println("Chieu dai cua chuoi la: "+string.length());
        do {
            System.out.println("Nhap vi tri index");
            index = scanner.nextInt();
        }while(index<0);
        System.out.println("Ky tu tai vi tri index la: "+string.charAt(index));
    }
}
