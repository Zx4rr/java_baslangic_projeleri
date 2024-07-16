import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Derece : ");
        int sicaklik = scan.nextInt();
        String event = "";

        if( sicaklik < 3){
           event ="Kayak";
        } else if (sicaklik<= 15) {
            event="Tiyatro";
        } else if ( sicaklik < 35) {
            event="Mangal";
        } else {
          event="Yüzme";
        }

        System.out.println("Önerilen Etkinlik : " + event);
    }
}