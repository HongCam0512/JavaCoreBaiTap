public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Java Version:");
        System.out.println(System.getProperty("java.version"));

        System.out.println("Java Runtime Version:");
        Runtime.Version runtime = Runtime.version();
        System.out.println(runtime);

        System.out.println("Java Home:");
        System.out.println(System.getProperty("java.home"));

        System.out.println("Java Vendor:");
        System.out.println(System.getProperty("java.vendor"));

        System.out.println("Java Version URL:");
        System.out.println(System.getProperty("java.version.url"));

        System.out.println("Java Class Path:");
        System.out.println(System.getProperty("java.class.path"));

    }
}
