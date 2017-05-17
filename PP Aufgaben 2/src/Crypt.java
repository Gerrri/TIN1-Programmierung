import java.io.*;

public class Crypt {

	public static void main (String args[])throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int schluessel;
		int verfahren;
		int abbruch;
		StringBuffer Eingabe;
		StringBuffer Ausgabe = new StringBuffer ("");
		char Buchstabe;
		
		
do {
		// Eingabe + Check des Wertes
		
		do{
			System.out.println("Geben Sie den Schlüssel zum ver- bzw. entschlüsseln ein (Zahl von 0 bis 25)");
			schluessel = Integer.parseInt(in.readLine());
			
			if (schluessel>25 || schluessel<1){
				System.out.println("Eingabe Ungültig - Bitte beachten Sie die Eingabebedingungen");
			}
			
		}while(schluessel>25 || schluessel<1);
		
		// Eingabe des Textes
		System.out.println("Geben Sie den zu ver- bzw. Entschlüsselnden Text ein: ");
		Eingabe = new StringBuffer (in.readLine());

		Ausgabe =new StringBuffer (Eingabe);
		
		do{
			System.out.println("Zum Verschlüsseln 1 + Enter");
			System.out.println("Zum Entschlüsseln 2 + Enter");
			verfahren = Integer.parseInt(in.readLine());
			
			if (verfahren != 1 && verfahren != 2){
				System.out.println("Eingabe Ungültig - Bitte beachten Sie die Eingabebedingungen");
			}
			
		}while(verfahren != 1 && verfahren != 2);
		
	
		
		//Verschlüsseln wenn 1
		if (verfahren == 1){
			for(int i=0; i<Eingabe.length();i++){
				
				int Buchstabenwert;
				
				Buchstabe = Eingabe.charAt(i);
				Buchstabenwert = ((int)Buchstabe);
				
				
				// Verschlüsselung für Großbuchstaben
				if (Buchstabenwert >= 65 && Buchstabenwert <= 90){
				
					Buchstabenwert = Buchstabenwert + schluessel;
					
					if(Buchstabenwert > 90){
						Buchstabenwert = Buchstabenwert - (26);
					}
					
					Buchstabe = ((char)Buchstabenwert); 	
				}
				
				
				//Verschlüsselung für KleinBuchstaben
				else if (Buchstabenwert >= 97 && Buchstabenwert <= 122){
					
					Buchstabenwert = Buchstabenwert + schluessel; 
					
					if(Buchstabenwert > 122){
						Buchstabenwert = Buchstabenwert - (26);
					}
					
					Buchstabe = ((char)Buchstabenwert); 	
					
					
				}
				

				Ausgabe.setCharAt(i, Buchstabe);
			}	
		}
		
		// Entschlüsseln wenn 2
		if (verfahren == 2){
			
			
			for(int i=0; i<Eingabe.length();i++){
				
				int Buchstabenwert=0;
				
				Buchstabe = Eingabe.charAt(i);
				Buchstabenwert = ((int)Buchstabe);
				
				
				// Entschlüsselung für Großbuchstaben
				if (Buchstabenwert >= 65 && Buchstabenwert <= 90){
				
					Buchstabenwert = Buchstabenwert - schluessel;
					
					if(Buchstabenwert < 65){
						Buchstabenwert = Buchstabenwert + (26);
					}
					
					Buchstabe = ((char)Buchstabenwert); 	
				}
				
				
				//Entschlüsselung für KleinBuchstaben
				else if (Buchstabenwert >= 97 && Buchstabenwert <= 122){  // Test abcdefghijklmnopqrstuvwxyz##  !"§$%&/()=?  ##ABCDEFGHIJKLMNOPQRSTUVWXYZ
					
					Buchstabenwert = Buchstabenwert - schluessel; 
					
					if (Buchstabenwert < 97){
						Buchstabenwert = Buchstabenwert + (26);
						
					}
				
					Buchstabe = ((char)Buchstabenwert); 	
					
					
				}
				
				Ausgabe.setCharAt(i, Buchstabe);
			}	
		}
		
		System.out.println(Ausgabe);
	
		abbruch = 0;
		System.out.println("");
		System.out.println("Zum wiederholen '0' + 'ENTER'5");
		abbruch = Integer.parseInt(in.readLine());
		
	
		
		
	}while (abbruch == 0);
		
	}
	
}
