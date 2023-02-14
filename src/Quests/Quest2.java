package Quests;

public class Quest2 {
	public static void tekrarEdenSayilariEkranaYazdir(int [] sayiDizisi) {
		boolean check=true;
		int tekrarEdenSayi=0;
		int sayac=0;
		while(check) {
			for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = 0; j < sayiDizisi.length; j++) {
				if ((i!=j) &&(sayiDizisi[i] == sayiDizisi[j])) {
					tekrarEdenSayi=sayiDizisi[i];
					break;
				}
			}	
			}
			for (int i = 0; i < sayiDizisi.length; i++) {
				if(tekrarEdenSayi==sayiDizisi[i]) {
					sayac++;
				}
			} if (tekrarEdenSayi==0) {
				System.out.println("Tekrar eden sayı bulunamamıştır");
				check=false;
			}else {
			System.out.println(tekrarEdenSayi+ " sayisi " + sayac + " kere tekrar etmiştir");
			check=false;
			}
			
			
			
			}
	}

	public static void main(String[] args) {
		int[] sayiDizisi= { 9, 7, 5, 3, 58, 65, 23, 18, 2, 0, 99 };
		// Bir dizide tekrar eden sayıyı bulan ve ekrana yazdıran bir static metod yazınız.Metod parametre 
		//olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup ekrana yazdıracaktır.
		//Tekrar eden sayı bulunmazsa “Tekrar eden sayı bulunamamıştır.” yazacaktır.
		tekrarEdenSayilariEkranaYazdir(sayiDizisi);
//		boolean check=true;
//		int tekrarEdenSayi=0;
//		int sayac=0;
		
//		while(check) {
//		for (int i = 0; i < sayiDizisi.length; i++) {
//		for (int j = 0; j < sayiDizisi.length; j++) {
//			if ((i!=j) &&(sayiDizisi[i] == sayiDizisi[j])) {
//				tekrarEdenSayi=sayiDizisi[i];
//				break;
//			}
//		}	
//		}
//		for (int i = 0; i < sayiDizisi.length; i++) {
//			if(tekrarEdenSayi==sayiDizisi[i]) {
//				sayac++;
//			}
//		} if (tekrarEdenSayi==0) {
//			System.out.println("Tekrar eden sayı bulunamamıştır");
//		}else {
//		System.out.println(tekrarEdenSayi+ " sayisi " + sayac + " kere tekrar etmiştir");
//		check=false;
//		}
		
		
		
		}
	

}
