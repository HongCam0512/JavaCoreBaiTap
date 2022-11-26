public class Bai2 {
    public static void main(String[] args) {
        for (int i=0; i<15; i++) {
            if (i < 9) {
                if (i%2 == 0) {
                    System.out.println("* * * * * =============================");
                } else {
                    System.out.println(" * * * *  =============================");
                }
            } else {
                System.out.println("=======================================");
            }
        }
    }
}
