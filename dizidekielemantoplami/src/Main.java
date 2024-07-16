import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Boyutunu giriniz: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        double sum = 0;
        for (int i = 0; i<numbers.length; i++){
            System.out.print((i + 1) + " . elemanı giriniz :");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double result = sum / numbers.length;

        System.out.println("Dizide ki elemanların ortalaması :" + result);

    }
}