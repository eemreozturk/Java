package java_examples;
import java.util.Random;
import java.util.Scanner;

public class random_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
			
		Random rastgele = new Random();
        int rastgele_sayi = rastgele.nextInt(11); 

        
        Scanner scanner = new Scanner(System.in);

        
        int tahmin;

        
        do {
            System.out.print("1 ile 10arasında sayı tahmin ediniz: ");
            tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 10) {
                System.out.println("Tahmin ettiğiniz sayı 1 ile 10 arasında olmalı.");
            } else if (tahmin < rastgele_sayi) {
                System.out.println("Düşük, tekrar tahmin ediniz.");
            } else if (tahmin > rastgele_sayi) {
                System.out.println("yüksek, tekrar tahmin ediniz.");
            } else {
                System.out.println("Tebrikler, doğru sayıyı buldunuz.");
            }
        } while (tahmin != rastgele_sayi);

        
        scanner.close();
		
		
	}

}
