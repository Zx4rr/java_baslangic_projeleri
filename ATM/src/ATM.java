import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;

        System.out.print("Bakiyeniz =" + bakiye);
        System.out.println("\n*****İŞLEMLER*****\n");
        System.out.println("1.Para Çekme");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Bakiye Sorgulama");
        System.out.println("4.Kart İade");

        System.out.println("\nİsleminizi Giriniz");
        int islem = scan.nextInt();

        switch (islem){
            case 1:
                System.out.print("Bakiyeniz = " + bakiye);
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz =");
                int tutar = scan.nextInt();
                if(tutar > bakiye){
                    System.out.println("Yetersiz");
                }
        }
    }
}
