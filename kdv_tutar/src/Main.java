import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price, total, kdvPrice,rate = 18;

        System.out.print("Tutar Giriniz = ");
        price = scan.nextDouble();

        kdvPrice = price * (rate / 100);
        total = kdvPrice + price;

        System.out.println("KDV ORANI : %" + rate);
        System.out.println("KDV TUTARI : %" + kdvPrice);
        System.out.println("KDV'Lİ TUTARI : %" + total);


        /*
        double price = 0.0;
        double rate = 18;
        System.out.println("Tutar Giriniz : ");
        price = scan.nextDouble();
        double kdvPrice = price * (rate / 100);
         double total = price + kdvPrice;
        System.out.println(kdvPrice);
         */
    }
}
