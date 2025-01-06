import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {

        // 1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them.
        // Print the results to the console. ("Perform" kelimesi, burada "gerçekleştirmek" veya "uygulamak" anlamına gelir.)


       // İki tam sayı değişleni tanımlama
        int a = 40;
        int b = 20;

        // Aritmetik işlemler
        int toplama = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        int bolme = a / b;

        // Sonuçları ekrana yazdırma
        System.out.println(toplama);
        System.out.println(cikarma);
        System.out.println(carpma);
        System.out.println(bolme);

        // 2. Write a program that calculates the area of a rectangle.
        // Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.

        // Scanner sınıfını kullanarak kullanıcıdan girdi alma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan uzunluk ve genişlik bilgilerini alma

        System.out.print("Dikdörtgenin uzunluğunu girin (tam sayı): ");
        int uzunluk = scanner.nextInt();
        System.out.print("Dikdörtgenin genişliğini girin (tam sayı): ");
        int genislik = scanner.nextInt();
        // Alan Hesaplama: Alan, uzunluk ve genişliğin çarpımı ile hesaplanır.
        int alan = uzunluk * genislik;


        // Sonucu ekrana yazdırma
        System.out.println("Dikdörtgenin alanı: " + alan);














    }
}
