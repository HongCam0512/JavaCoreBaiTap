import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhap vao mot chuoi");
        chuoi = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(chuoi);
        System.out.println("Chuoi moi la:" +stringBuffer.reverse().toString());
        System.out.println("Cach 2");
        stringBuffer(chuoi);
    }
    public static void stringBuffer(String chuoiHoanDoi) {
        int i, j=0, index;
        char [] hoanDoi=chuoiHoanDoi.toCharArray();
        for (i = chuoiHoanDoi.length()-1; i >=0; i--) {
             hoanDoi[j] = chuoiHoanDoi.charAt(i);
             j++;
        }
        for (j = 0; j<chuoiHoanDoi.length(); j++) {
           System.out.print(hoanDoi[j]);
        }
    }
}
