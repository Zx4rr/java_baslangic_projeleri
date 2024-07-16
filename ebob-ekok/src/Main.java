import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Birinci Sayıyı Giriniz: ");
        int number1= input.nextInt();

        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        int number2= input.nextInt();
        /*
       int n = Math.min(number2,number1);
       int ebob = 1;

       for (int i=1; i<=n; i++ ){
           if ((number1 % i == 0) && (number2 % i == 0)){
               ebob = i;
           }
       }
       */

        int n = Math.max(number1 , number2);
        int ebob = 1;
        for (int i =n; i>= 1; i--){
            if ((number1 % i == 0) && (number2 % i ==0)){
                ebob = i;
                break;
            }
        }

        int ekok = (number1 * number2) / ebob;
        System.out.println("Ekrana Girilen Sayıların EBOB'U: " + ebob);
        System.out.println("Ekrana Girilen Sayıların EKOK'U: " + ekok);
    }
}