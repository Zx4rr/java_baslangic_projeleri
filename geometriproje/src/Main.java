import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1 . Kenarı giriniz:");
        int a = scan.nextInt();

        System.out.print("2 . Kenarı giriniz:");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + (int)c);

        double u = Math.sqrt((a+b+c/2));
        double d = Math.sqrt((u * 2));

        
        System.out.println("Çevre:" + (double) d );

    }
}