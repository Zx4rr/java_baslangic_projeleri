import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Kaç Satır Olsun =");
        int number = input.nextInt();

        for (int i = 1; i<= number; i++){
            for (int j = 1; j<= (i-1); j++){
                System.out.print(" ");
            }
            int starCount = (number + 1)- i;
            for (int k=1; k <= 2* starCount-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}