package java_examples;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
		
		 Scanner veri = new Scanner(System.in);
		 System.out.print("Sipariş numaranızı giriniz:");
		 int s_numarası = veri.nextInt(); 
		   switch (s_numarası) {
		     case 1:
		       System.out.println("Elma");
		       break;
		     case 2:
		       System.out.println("Armut");
		       break;
		      case 3:
		       System.out.println("Portakal");
		       break;
		     default:
		       System.out.println("Sipariş numarası eşleşmedi, lütfen doğru sipariş numarasını giriniz.");
		   }
		
	}

	  
	
}
