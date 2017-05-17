import java.io.*;

// HIER EINSETZEN: Klassendefinition fuer die Mensakarte

public class Main {

	public static void main(String args[]) throws IOException {

		Mensakarte karte = new Mensakarte(23.9,"Herbert Huber");  // HIER EINSETZEN: Deklaration der Objektvariablen fuer eine Mensakarte
																  // und Erzeugung eines entsprechenden Objekts mit fest vorgebenen
																  // Anfangswerten seiner Attribute
		
		//Mensakartenverzeichnis verz = new Mensakartenverzeichnis();

		//Mensakarte karte = new Mensakarte();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		boolean erfolg,state;
		double guthaben=0;
		int temp1;

		do {

			System.out.println();
			System.out.println("Bitte waehlen:");
			System.out.println("(1) Karte aufladen");
			System.out.println("(2) Guthaben anzeigen");
			System.out.println("(3) Kaffee abbuchen");
			System.out.println("(4) Essen abbuchen");
			System.out.println("(5) Verbleibende Kaffees anzeigen");
			System.out.println("(6) Sperre toggeln");
			System.out.println("(7) Essen + Kaffe");
			//System.out.println("(8) Mensakarte in Objekt");
			System.out.println("(0) Ende");
			choice = Integer.parseInt(in.readLine());
			System.out.println();

			switch (choice) {

			case 1:
				System.out.print("Aufladebetrag? ");
				double betrag = Double.parseDouble(in.readLine());
				karte.Aufladen(betrag);
				break;

			case 2:
				guthaben = karte.Guthaben_abfragen();
				System.out.println("Guthaben : '"+guthaben+"€'");				
				break;

			case 3:
				erfolg = karte.Buy_Kaffee();
				
				if(erfolg==true){System.out.println("Erfolg!");}
				else {System.out.println("Fehler!");}
				
				break;

			case 4:
				System.out.print("Essenspreis? ");
				double preis = Double.parseDouble(in.readLine());
				erfolg = karte.Buy_Essen(preis);
				
				if(erfolg==true){System.out.println("Erfolg!");}
				else {System.out.println("Fehler!");}
				
				break;

			case 5:
				temp1 = karte.Anzahl_Kaffee();
				System.out.println(temp1+" Kaffee verbleibend");
				break;

			case 6:
				state = karte.toggel();
				if(state==true){System.out.println("Karte ist gesperrt");}
				else {System.out.println("Karte ist entsperrt");}
				break;
				
			case 7:
				System.out.println("Geben Sie Essenkosten ein: ");
				double preis1 = Double.parseDouble(in.readLine());
				
				System.out.println("anzahl: ");
				int anzahl = Integer.parseInt(in.readLine());
				
				erfolg = karte.essen_kaffee(preis1,anzahl);
				
				if(erfolg==true){System.out.println("Es ist genug Geld verfügbar!");}
				else {System.out.println("Zu wenig Guthaben -  Bitte laden Sie die Karte auf!");}
				
				break;
				

			}

		} while (choice != 0);

	}

}