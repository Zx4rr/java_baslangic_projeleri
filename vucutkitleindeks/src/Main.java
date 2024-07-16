import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu (metre cinsinden) giriniz:");

        double boy = scan.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz:");
        double kilo = scan.nextDouble();

        double indeks = kilo / (boy * boy);

        if (indeks <= 18.5) {
            System.out.println("Vücut Kitle İndeksiniz : Zayıf" + indeks);
        }else{
            System.out.println();
        }

       // System.out.println("Vücut Kitle İndeksiniz :" + indeks);

    }
}