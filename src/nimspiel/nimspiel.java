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
		Scanner scanner = new Scanner(System.in);
		
		boolean zahlOk = false;
		int min = 5;
		int max = 100;
		String eingabe;
		int nWood;
		String nameOfPlayer;
		int numberOfHaufen = 1;
		boolean gamePlaying = true;
		boolean isGameOver = false;
		int zaehler = 0;
		
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
			
			
			while (gamePlaying) {
				boolean moveOk = true;
				
				do {
					if (!moveOk) {
						System.out.println("Cell already filled !");
					}
					while (zaehler == 0) {

						try {
							System.out.println("Bitte geben Sie die Nummer des Haufens ein und die Anzahl wie Sie den Haufen aufteilen wollen");
							System.out.println("Format [Haufen] [Hölzer]");
							Teilen userMove = new Teilen(scanner.nextInt(), scanner.nextInt());
							System.out.println("Hier: Etwas tun mit der Eingabe: " + userMove);
						}
						catch (NumberFormatException ausnahme) {
							System.out.println("Bitte eine Zahl eingeben!");
							continue;
						}
						zaehler++;
						}
					
					// b.placeAMove(userMove, Board.PLAYER_O);
					
				} while (!moveOk);
				// Achtung: Vorher noch etwas tun mit der Eingabe, sonst geht es schief...!!!
				zeigeAlleHaufen(haufen, numberOfHaufen);
				
				if (isGameOver)
					break;
				
				// Computer move
				// b.minimax(0, Board.PLAYER_X);
				//System.out.println("DAs kommt von minimax zurück: " + b.minimax(0, Board.PLAYER_X));
				System.out.println();
				System.out.println("Computer choose postion : ");
				
				//b.placeAMove(b.computerMove, Board.PLAYER_X);	
				zeigeAlleHaufen(haufen, numberOfHaufen);
			}
			
			/*
			if (b.hasPlayerWon(Board.PLAYER_X))
				System.out.println("You lost !");
			else if(b.hasPlayerWon(Board.PLAYER_O))
				System.out.println(" You win !");
			else
				System.out.println("Draw !");
						
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





