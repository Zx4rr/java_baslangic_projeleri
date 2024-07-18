import java.util.Scanner;
//Ortalama Not = (Vize Notu * 0.3) + (Kısa Sınav Notu * 0.2) + (Final Notu * 0.5)
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kısa Sınav Notunuzu giriniz:");
        int kısa = scan.nextInt();
        System.out.print("Vize notunuzu giriniz:");
        int vize = scan.nextInt();
        System.out.print("Final notunuzu giriniz:");
        int fınal = scan.nextInt();

        double not = (vize * 0.4) + (kısa * 0.2) + (fınal * 0.6);

        System.out.println("Yıl sonu notunuz:" + not);

        if (not > 90){
            System.out.println("AA ile dersi geçtiniz");
        }
        else if (not > 85){
            System.out.println("BA ile dersi geçtiniz");
        }
        else if (not > 80){
            System.out.println("BB ile dersi geçtiniz");
        }
        else if (not > 70){
            System.out.println("CB ile dersi geçtiniz");
        }
        else if (not > 50){
            System.out.println("Koşullu ile geçtiniz");
        }
        else {
            System.out.println("Dersi Geçtiniz");
        }
    }
}