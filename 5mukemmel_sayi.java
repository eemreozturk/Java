package java_examples;
import java.util.Scanner;

public class mukemmel_sayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.
		
		int toplam =0;
		Scanner scanner=new Scanner(System.in);
	     
		System.out.println("Mükemmel sayı olup oldadığını kontrol etmek istediğiniz sayıyı giriniz:");
		int sayi=scanner.nextInt();
		 
		    for (int i=1; i<=sayi; i++)
		    {
		    	if(sayi%i==0)
		    		toplam+=i;
		    }
		    if(toplam==sayi*2) {
		    	System.out.println(sayi+" Mükemmel sayıdır.");
		    }
		    else {
		    	
		    	System.out.println(sayi+" Mükemmel sayı değildir.");
		    }
		}
	
	}


