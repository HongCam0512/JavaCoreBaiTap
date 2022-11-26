import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a=0, b=0, c, x, h;
        float t;
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm");

        System.out.println("Hay nhap gio den :");
        String timeInput = scanner.nextLine();
        LocalTime timeIn = LocalTime.parse(timeInput, parseFormat);

        while (timeIn.getHour() < 9) {
            System.out.println("Vui long nhap lai gio den trong khoang 9:00 toi 24:00:");
            timeInput = scanner.nextLine();
            timeIn = LocalTime.parse(timeInput, parseFormat);
        }

        System.out.println("Hay nhap gio ve :");
        String timeOutput = scanner.nextLine();
        LocalTime timeOut = LocalTime.parse(timeOutput, parseFormat);
        h = timeOut.getHour();
        if (timeOut.getHour() == 0) h = 24;
           while (h <= 9 || h >24 || timeIn.getHour() == timeOut.getHour() || timeIn.getHour() > timeOut.getHour()) {
             System.out.println("Vui long nhap lai gio ve trong khoang 9:00 toi 24:00:");
             timeOutput = scanner.nextLine();
             timeOut = LocalTime.parse(timeOutput, parseFormat);
             h = timeOut.getHour();
        }
        // input so chai nuoc su dung
        do {
            System.out.println("Hay nhap so chai nuoc da su dung :");
            c = scanner.nextInt();
        } while (c < 0);
        // tinh gio
        if (timeIn.getMinute() == 0 && timeOut.getMinute() == 0) x = h - timeIn.getHour();
         else x = (h-timeIn.getHour()) + (timeOut.getMinute()/60) + (60-timeIn.getMinute())/60;
         // tinh tien
        if (x < 3) {
            t = x * 30;
        } else {
            t = ((x - 3) * 90 * 30) / 100 + 3 * 30;
        }
        // tinh tien nuoc
        if (c != 0) {
            t = t + c * 10;
        }
        // giam gia
        if (9 < timeIn.getHour() || timeIn.getHour() < 17) {
            t = t - t * 20 / 100;
        }
        System.out.println("Tong tien can thanh toan la: " + t * 1000);
    }

}