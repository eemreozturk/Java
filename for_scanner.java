package java_examples;

import java.util.Scanner;
import java.util.ArrayList;

public class for_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
		
		
		//1
		int toplam1=0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç adet ürün almak istiyorsunuz:");
		int urun_adet = scanner.nextInt();
		
		for(int a=1 ; a<=urun_adet ; a++ ) {
			System.out.print(a + ". ürünün fiyatını giriniz: ");
			int urun_fiyati=scanner.nextInt();
			toplam1+=urun_fiyati;
		}
		
		System.out.print("Toplam ödenecek tutar:"+toplam1+"\n");
		
		//2
		int toplam=0;
		String[] urun_listesi= {"Elma","Armut","Portakal"};
		int [] urun_fiyat_listesi= {10,15,20};
		
		 for(int i=0;i<urun_listesi.length;i++) {
			 
			 Scanner scanner_urun = new Scanner(System.in);
			 System.out.print("Kaç "+ urun_listesi[i] +" almak istersiniz? (Fiyatı:"+urun_fiyat_listesi [i]+")");
			 int adet = scanner_urun.nextInt();
			 toplam +=adet*urun_fiyat_listesi[i];
			
		 }
		 
		 System.out.print("Toplam ödenecek tutar:"+toplam);
		
		 
		 
	}

}
