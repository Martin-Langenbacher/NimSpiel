package nimspiel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class nimspiel {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		boolean zahlOk = false;
		int min = 5;
		int max = 100;
		String eingabe;
		int nWood;
		String nameOfPlayer;
		int numberOfHaufen = 1;
		
		// What is your name:
		Scanner myObj = new Scanner(System.in);
	    
	    System.out.println("Bitte geben Sie Ihren Namen ein:"); 
	    nameOfPlayer = myObj.nextLine();  
	    
	    
	    
	    if (nameOfPlayer.length() < 2 || nameOfPlayer.length() > 20) {
	    	nameOfPlayer = "Player";
		}	    
	    
	       
	    System.out.println();
				
		
		// Anzahl der Hölzer: N
		while (!zahlOk) {

			try {
				System.out.println(nameOfPlayer +", bitte gib die Anzahl der Hölzer im Spiel ein (" +min +" <= N <= " +max + "):\n");
				eingabe = br.readLine();
				nWood = Integer.parseInt(eingabe);
			}

			catch (NumberFormatException ausnahme) {
				System.out.println("Bitte eine Zahl eingeben!");
				continue;
			}
			if (nWood >= min && nWood <= max) {
				zahlOk = true;
			} else {
				System.out.println(nWood +" ist nicht im Bereich von " +min +" und "+max + "!");
			}
			
			
			// nun startet das Nim-Spiel
			ArrayList<Haufen> haufen = new ArrayList<>();
			
			haufen.add(new Haufen(numberOfHaufen, nWood));
			zeigeAlleHaufen(haufen, numberOfHaufen);
			numberOfHaufen++;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			
			
		ArrayList<Wort> words = new ArrayList<>();
		
		if (eingabeString.equals("")) {
			eingabeString = "Fehler!";
		}
		
		
		// String in Wörter aufteilen
		int i = 0;
		do {
		  String buchstabe = "" + eingabeString.charAt(i);
			
			
			
			if (buchstabe.equals(" ")) {
				if (newWordString != "") {
					words.add(new Wort(i, newWordString));
					amountOfWords++;
					newWordString = "";
				} else {
					newWordString = "";
				}
				
			} else {
				newWordString = newWordString + buchstabe;
			}
		  i++;
		}
		while (i < eingabeString.length());
		words.add(new Wort(i, newWordString));
		amountOfWords++;
		
		System.out.println("amount of Words: " + amountOfWords);
		
		
		// Vergleich der Wörter
		for (int j = 0; j < amountOfWords-1; j++) {
			for (int m = j+1; m < amountOfWords; m++) {
				
				if ((words.get(j).getNumberOfWord() != 0) && Wort.compareWords(words.get(j).getWordString(), words.get(m).getWordString())) {
					// words are the same
					words.get(j).setNumberOfWord(words.get(j).getNumberOfWord() + 1);
					words.get(m).setNumberOfWord(0);
				} 	
			}
		}
		
		
		// ausgeben der Liste...
		for (int j = 0; j < amountOfWords; j++) {
			if (words.get(j).getNumberOfWord() != 0 && !words.get(j).getWordString().equals("")) {
				System.out.println(words.get(j).getWordString() + ": " +words.get(j).getNumberOfWord());
				
			}	
		}
	}

			*/

			
		}		

	}

	
// ==============================================> Methoden <==========================================================	
	private static void zeigeAlleHaufen(ArrayList<Haufen> haufen, int numberOfHaufen) {
		
		for (int i = 0; i < numberOfHaufen; i++) {
			if (haufen.get(i).isActive()) {
				System.out.println(haufen.get(i).getNumber() + ": Hölzer: " +haufen.get(i).getNumberOfWoods());	
			}
		}
		

		
		
		
		
	}

}





