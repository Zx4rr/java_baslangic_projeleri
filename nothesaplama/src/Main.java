import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fizik , matematik , turkce ,kimya , muzik , tarih , resim ;
        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();

        System.out.print("Matematik Notunuz:");
        matematik = input.nextInt();

        System.out.print("Türkçe Notunuz");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuz");
        tarih = input.nextInt();

        System.out.print("Resim Notunuz");
        resim = input.nextInt();

        int sonuc = (fizik + matematik + turkce + kimya + muzik + tarih) / 6;

        System.out.println("Ortalamanız " + sonuc);
    }
}