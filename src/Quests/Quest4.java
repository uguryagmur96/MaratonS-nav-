package Quests;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean check=true;
		
		while(check) {
		
		System.out.println("* * * * * * * * * * ** * * *  * * * **");
		System.out.println("*         Geometrik Hesaplayıcı      *");
		System.out.println("** * * * * * * * * * ** * * *  * * * *");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama"); 
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");
		int secim=scan.nextInt();
		scan.nextLine();
		
		switch(secim) {
		case 1:
			System.out.println("Lütfen karenin bir kenar uzunluğunu giriniz");
			int k=scan.nextInt();
			System.out.println("Girdiğiniz kenar uzunluğuna göre karenin alanı: " + (k*k));
			break;
		case 2:
			System.out.println("Lütfen karenin bir kenar uzunluğunu giriniz");
			int k1=scan.nextInt();
			System.out.println("Girdiğiniz kenar uzunluğuna göre karenin çevresi: " + (k1*4));
			break;
		case 3:
			System.out.println("Lütfen dikdörtgenin uzun kenar uzunluğunu giriniz");
			int uk=scan.nextInt();
			System.out.println("Lütfen dikdörtgenin kısa kenar uzunluğunu giriniz");
			int kk=scan.nextInt();
			System.out.println("Girdiğiniz kenar uzunluklarına göre dikdörtgenin alanı: " + (uk*kk));
			break;
		case 4:
			System.out.println("Lütfen dikdörtgenin uzun kenar uzunluğunu giriniz");
			int uk1=scan.nextInt();
			System.out.println("Lütfen dikdörtgenin kısa kenar uzunluğunu giriniz");
			int kk1=scan.nextInt();
			System.out.println("Girdiğiniz kenar uzunluklarına göre dikdörtgenin alanı: " + 2*(uk1+kk1));
			break;
		case 5:	
			System.out.println("Lütfen dairenin yarı çapını giriniz");
			double r=scan.nextDouble();
			double pi=3.14;
			System.out.println("Girmiş olduğunuz yarı çapa göre dairenin alanı" + pi*(r*r) );
			break;
		case 6:
			System.out.println("Lütfen dairenin yarı çapını giriniz");
			double r1=scan.nextDouble();
			double pi1=3.14;
			System.out.println("Girmiş olduğunuz yarı çapa göre dairenin çevresi" + 2*(r1*pi1) );
			break;
		case 7: 
			check=false;
			System.out.println("Hoşçakalın..");
		}

	}
	}
}
