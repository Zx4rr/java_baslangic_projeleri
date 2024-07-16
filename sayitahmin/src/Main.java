import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        int cevap =rastgele.nextInt(5);

        int kalanhak = 3, toplamdenemehak = 4;
        System.out.println("Toplam 3 Deneme Hakkınız Kaldı");
        for (int denemesayisi = 1; denemesayisi < toplamdenemehak; denemesayisi++){
            int girdiginizsayi;
            System.out.print(" (0 - 5 arası sayı) Bir Sayı Giriniz = ");
            girdiginizsayi= input.nextInt();

            if (girdiginizsayi != cevap){
                kalanhak = toplamdenemehak - denemesayisi;
                kalanhak--;
                if (kalanhak == 0){
                    System.out.println("Oyun Bitti Hakkınız Kalmadı");
                    System.out.println("Doğru Cevap = " + cevap);
                }
                else System.out.println("Tahmininiz Yanlış Tekrar Deneyiniz " + kalanhak + "Deneme Hakkı Kaldı");
            }
            else {
                System.out.println(denemesayisi + "Denemede Doğru Cevabı Buldunuz");
                System.out.println( "Tahminiz Doğru Cevap=" + cevap);
                denemesayisi = toplamdenemehak;
            }
        }
    }
}