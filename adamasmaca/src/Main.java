import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words =  {"java" , "programlama" , "bilgisayar" , "insan" , "kitap"};
        String wordToGuess = words[random.nextInt(words.length)];
        System.out.println(wordToGuess);

        boolean[] guessedLetters = new boolean[wordToGuess.length()];



        int remainingGuess = 6;


        System.out.println("Adam asmaya HOŞGELDİNİZ");
        System.out.println("Kelimeyi tahmin etmek için harf girişini yapın.");

        while (remainingGuess > 0){
            System.out.println();

            for(int i=0; i< wordToGuess.length(); i++){
                if(guessedLetters[i]){
                    System.out.print(wordToGuess.charAt(i) + " ");
                }else {
                    System.out.print(" ");

                }
            }

            System.out.println("");
            System.out.println("Kalan Tahmin Hakkınız :" + remainingGuess);
            System.out.print("Harf Giriniz:");
            char guess = scanner.next().charAt(0);

            boolean isFound = false;

            for (int i = 0; i < wordToGuess.length(); i++){
                if (wordToGuess.charAt(i) == guess){
                    guessedLetters[i]= true;
                    isFound = true;
                }
            }
            if (isFound){
                System.out.println("Harf Doğru Tahmin Edildi");
            }else {
                remainingGuess--;
                System.out.println("Harf Bulunamadı. Yanlış Tahmin edildi");
            }

            boolean isComplete =true;
            for (boolean letter:guessedLetters){
                if (!letter){
                    isComplete = false;
                    break;
                }
            }

            if (isComplete){
                System.out.println("Tebrikler Kelimeyi doğru tahmin ettiniz:" + wordToGuess);
                break;
            }

        }

        if (remainingGuess == 0){
            System.out.println("Tahmin Hakkınız bitti . ŞEYH SAİTİ ASTINIZ HELAL OLSUN");
            System.out.println("Doğru Kelime:" +wordToGuess);
        }

    }
}