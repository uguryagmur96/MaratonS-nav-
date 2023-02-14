package Quests;

public class Quest3 {
	
	public static int karakterSayici(String word, char letter) {
		
		int karakterSayisi=0;
		for (int i = 0; i < word.length(); i++) {
			if (letter==word.charAt(i)) {
				karakterSayisi++;
			}
		}
		return karakterSayisi;
	}

	public static void main(String[] args) {
		// karakterSayici isimli static bir Java metodu yazınız. Bu metod bir String bir de char değişkenini
		//parametre olarak alacaktır. Fonksiyon paramtre olarak gelen String içindeki yine parametre olarak 
		//gelen karakterin sayısını sayıp return edecektir.
		
		char letter='g';
		String word="Bugün haga çgk güzel";
		
		System.out.println(karakterSayici(word,letter));
	

	}

}
