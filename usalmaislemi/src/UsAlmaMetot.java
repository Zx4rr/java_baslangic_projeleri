import java.util.Scanner;

public class UsAlmaMetot {
    static int usalma(int sayi1, int sayi2){
        int sonuc = (int) Math.pow(sayi1, sayi2);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz=");
        int sayi1 = sc.nextInt();
        System.out.print("2.sayıyı giriniz=");
        int sayi2 = sc.nextInt();

        int sonuc = usalma(sayi1,sayi2);
        System.out.println(sayi1 + " ^ " + sayi2 + " = " + sonuc);
    }
}
