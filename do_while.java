package java_examples;
import java.util.ArrayList;



public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
		//Do kısmında ki döngü bloğu işlenir ardından while kısmında ki koşul denetlenir.
		//while tek bir parametre alır ve bu parametre doğru olduğu sürece döngü sürer.
		
		String[] urun_listesi= {"Elma","Armut","Portakal"};
		int i = 0; 
		do{
		    System.out.print(urun_listesi[i] + ','); 
		    i++;
		}while (i < 3);
		int a=0;
		
		while (a < 3) {
			System.out.print(urun_listesi[a] + '.'); 
		    a++;
		}
		
	}

}
