package java_examples;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String metotlarını araştırınız. Her bir metot için örnek yapınız.
		
		String dunya= "Merhaba dünya" ;
		
		//length
		System.out.println("Uzunluk " + dunya.length());
		
		System.out.println(dunya.substring(0, 7));//7'ye kadar(sadece merhaba)
		System.out.println(dunya.substring(8, dunya.length()));//8'den sonta (sadece dünya)
		System.out.println("Dünya" + dunya.indexOf("dunya") +". karakterden sonra başlıyor");
		
		if (dunya.equalsIgnoreCase("merhaba dünya"))
	        System.out.println("Aynı deger");//equalsıgnorecase önce küçük harflere çeviriyor sonra karşılaştırıyor.
		
		System.out.println("Küçük harf : " + dunya.toLowerCase());
		System.out.println("Büyük harf : " + dunya.toUpperCase());//metni büyük ve küçük harflere çevirme
		
		System.out.println("Bosluklar yok " + dunya.trim());//baştaki ve sondaki boşluklardan kurtulmak
		
		String[] words = dunya.split(" ");//kelimeleri ayıklayarak string dizisi haline getirme 
		
		         
		   byte[] strByte = dunya.getBytes();         
		   System.out.println(new String(strByte));//string'i byte dizisine çeviren metod
		   
		   System.out.println("karakter"+"   "+"indeks");
	        for(int i=0; i<=dunya.length()-1; i++) {
	            System.out.println(dunya.charAt(i)
	                    +"            "
	                    +i);
	        }
		   
	}

}
