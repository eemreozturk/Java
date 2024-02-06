package java_examples;
import java.util.Scanner;

public class ogrenci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,
		//3.sınav notu isteyen ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.
		
		Scanner scanner=new Scanner(System.in);
	     
		System.out.println("Öğrenci sayısını giriniz:");
		int ogrenci_sayi=scanner.nextInt();
		 
		for (int i=1; i<=ogrenci_sayi; i++)
	    {
			System.out.println("Öğrenci adını giriniz:");
			String adi = scanner.next();
			
			System.out.println("Öğrenci soyadı giriniz:");
			String soyadi = scanner.next();
			
			System.out.println("1. sınav notunu giriniz:");
			int sinav1=scanner.nextInt();
			
			System.out.println("2. sınav notunu giriniz:");
			int sinav2=scanner.nextInt();
			
			System.out.println("3. sınav notunu giriniz:");
			int sinav3=scanner.nextInt();
			
			int ort=(sinav1+sinav2+sinav3)/3;
			System.out.println("Öğrenci adı: "+ adi +"\nÖğrenci soyadı: "+soyadi+"\nNot ortalaması: "+ ort);
			
			
	    }
	scanner.close();	
	}

}
