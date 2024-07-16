import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean devamEt = true;

        while (devamEt) {
            System.out.print("1. Sayıyı Girin: ");
            int a = scan.nextInt();
            System.out.print("2. Sayıyı Girin: ");
            int b = scan.nextInt();

            int select;
            boolean validInput = false; // kullanıcının geçerli bir işlem yapmnasını bekler

            while (!validInput) {
                System.out.println("İşlem Seçiniz:");
                System.out.println("1. Toplama");
                System.out.println("2. Çıkarma");
                System.out.println("3. Çarpma");
                System.out.println("4. Bölme");

                System.out.print("İşleminiz: ");
                select = scan.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Sonuç: " + (a + b));
                        validInput = true;
                        break;
                    case 2:
                        System.out.println("Sonuç: " + (a - b));
                        validInput = true;
                        break;
                    case 3:
                        System.out.println("Sonuç: " + (a * b));
                        validInput = true;
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Bölen sayısı sıfır olamaz.");
                        } else {
                            System.out.println("Sonuç: " + (a / b));
                            validInput = true;
                        }
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir işlem giriniz.");
                }
            }

            System.out.print("Başka bir işlem yapmak istiyor musunuz? (E/H): ");
            char cevap = scan.next().charAt(0);
            if (cevap == 'H' || cevap == 'h') {
                devamEt = false;
            }
        }
    }
}
