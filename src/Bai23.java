import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string, result="";
        int max =0;
        System.out.println("Nhap vao mot chuoi");
        string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                result +=string.charAt(i);
            }
        }
        if (result == "") {
            System.out.println("Khong tim duoc chuoi");
        } else System.out.println("Chuoi palindromic tim duoc la   "+result);
    }
}
