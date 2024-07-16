import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("KM VERİSİNİ GİRİNİZ:");
        double km = scan.nextInt();
        double price = 10 + (km * 2.20);

        if (price<20){
            price = 20;
        }
        System.out.println("Taksimetre =" + price);
    }
}