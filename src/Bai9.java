import java.awt.*;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap vao mot chuoi:");
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();
        boolean found = true;
        for (int i =0; i< charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (found) {
                 charArray[i] = Character.toUpperCase(charArray[i]);
                 found= false;
                }
            } else {
                found = true;
            }
        }
        string = String.valueOf(charArray);
        System.out.print("Chuoi moi la:" +string);
    }

}
