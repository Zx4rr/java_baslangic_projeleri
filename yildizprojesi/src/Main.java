public class Main {
    public static void main(String[] args) {
        int n = 6; // Piramidin yüksekliği (satır sayısı)
        
        // Dış döngü piramidin satırlarını oluşturur
        for (int i = 1; i <= n; i++) {
            
            // Bu iç döngü, her satırda basılacak boşlukları oluşturur
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" "); // Boşluk basma
            }
            
            // Bu iç döngü, her satırda yıldızları basar
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*"); // Yıldız basma
            }
            
            // Her satır tamamlandığında alt satıra geçiş yapılır
            System.out.println();
        }
    }
}



