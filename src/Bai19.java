import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tienGui, tienLai, tienCan;
        System.out.println("Nhap so tien muon gui");
        tienGui = scanner.nextFloat();
        System.out.println("Nhap so tien can");
        tienCan = scanner.nextFloat();
        System.out.println("Nhap so tien lai mot nam");
        tienLai = scanner.nextFloat();
        int year;
        year = (int)((tienCan-tienGui)/tienLai);
        System.out.println("So nam it nhat can la:" +year);
    }
}
