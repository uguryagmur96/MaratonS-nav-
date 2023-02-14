package Quests;

public class Quest1 {
	
	
	public static void yildizYazdirma() {
		String star ="*";
		boolean check=true;
		
		while(check) {
			for (int i = 0; i <6; i++) {
				System.out.println(star);
				star+="*";
			}
			for (int i = 0; i <4; i++) {
				System.out.println(star);
				
		}
		check=false;
		
	}
	}
	public static void main(String[] args) {
		// 1.Aşağıdaki şekli döngüler kullanarak ekrana çizdiren static metod yazınız ve main içinden bu
		//metodu çağırarak çalıştırınız:Programınız çalıştırıldığında konsola aşağıdaki görüntüyü çıkaracaktır:
		//Program Run:
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		//* * * * * *
		//* * * * * * *
		//* * * * * * * 
		//* * * * * * * 
		//* * * * * * * 
		
		yildizYazdirma();

	}

}
