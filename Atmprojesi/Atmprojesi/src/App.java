import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sınıfı ile kullanıcıdan veri almak için scan objesi oluşturuluyor
        Scanner scan = new Scanner(System.in);

        // Başlangıç bakiyesi 1000 olarak belirleniyor
        int bakiye = 1000;

        // Mevcut bakiye ekrana yazdırılıyor
        System.out.println("Bakiyeniz = " + bakiye);
        
        // Kullanıcıya yapılabilecek işlemler listeleniyor
        System.out.println("\n *****İSLEMLER*****\n");
        System.out.println("1.Para Çekme");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Bakiye Sorgulama");
        System.out.println("4.Kart İade");

        // Kullanıcıdan işlem seçmesi isteniyor
        System.out.println("\n İşleminizi Seçiniz:");
        int islem = scan.nextInt();  // Kullanıcının seçtiği işlem alınıyor

        // Kullanıcının seçimine göre farklı işlemler yapılacak
        switch (islem) {
            case 1:
                // Para çekme işlemi
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");
                int tutar = scan.nextInt();  // Çekilmek istenen tutar alınıyor

                // Eğer bakiye yetersizse kullanıcıdan tekrar tutar isteniyor
                if (tutar > bakiye) {
                    System.out.println("Yetersiz Bakiye, Tekrar Giriniz:");
                    tutar = scan.nextInt();  // Yeni tutar alınıyor
                }

                // Bakiye güncelleniyor ve yeni bakiye ekrana yazdırılıyor
                bakiye -= tutar;
                System.out.println("Yeni Bakiyeniz: " + bakiye);
                break;

            case 2:
                // Para yatırma işlemi
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz:");
                tutar = scan.nextInt();  // Yatırılmak istenen tutar alınıyor

                // Bakiye güncelleniyor ve yeni bakiye ekrana yazdırılıyor
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz = " + bakiye);
                break;

            case 3:
                // Bakiye sorgulama işlemi
                System.out.println("Bakiyeniz = " + bakiye);
                break;

            case 4:
                // Kart iade işlemi
                System.out.println("Kartınız iade edilecektir, almayı unutmayın!!!");
                break;

            default:
                // Geçersiz işlem seçildiğinde ekrana hata mesajı yazdırılıyor
                System.out.println("Hatalı İşlem Seçtiniz, Tekrar Giriniz...");
        }
    }
}
