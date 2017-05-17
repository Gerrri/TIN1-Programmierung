import java.io.*;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]) throws IOException {

		//int[] a = new int[7];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int stringwert = 0, anzahl = 0;
		String suchwort = "";

		// ####################### EINGABE #################################
		do {
			System.out.println("Wieviele String möchten Sie Eingaben ? :                          (zwischen 1 und 6");
			anzahl = Integer.parseInt(in.readLine());

		} while (anzahl < 1 || anzahl > 6);

		// ####################### String erstellen
		// #################################
		String[] s = new String[anzahl];

		// ####################### Wörter Einlesen
		// #################################
		for (int i = 0; i < anzahl; i++) {
			String einf = "";

			System.out.println("Geben Sie String nummer '" + (i + 1) + "' ein");
			einf = in.readLine();

			s[i] = einf;
		}

		// ####################### Array Sortieren
		// #################################
		Arrays.sort(s);

		// TEST AUSGABE ARRAY
		for (int i = 0; i < anzahl; i++) {
			System.out.println("String " + i + " " + s[i]);
		}

		// ####################### Suchwort einlesen
		// #################################
		System.out.println("Bitte gebe das zu suchende Wort ein:");
		suchwort = in.readLine();

		// ####################### Wort suchen(aufruf methode)
		// #################################
		stringwert = SearchinArray(s, suchwort);

		System.out.println("Der Wert: '" + suchwort + "' ist "
				+ (stringwert < 0 ? "nicht gefunden" : ("an Position : " + stringwert + " gefunden.")));

		if (stringwert == -1) {
			System.out.println("Das Wort existiert nicht");
		} else {
			System.out.println("Wort ist an stelle : " + stringwert);
		}

	}

	public static int SearchinArray(String feld[], String suche) {
		int li = 0, mi, re = feld.length - 1;
		while (true) {

			mi = (int) Math.ceil((re + li) / 2.0);

			if (feld[mi].equals(suche))
				return mi;

			if (li == re)
				return -1;

			for (int x = 0; x < feld[mi].length(); x++) {

				if (!(feld[mi].charAt(x) == suche.charAt(x))) {

					if (suche.charAt(x) > feld[mi].charAt(x)) {
						li = mi + 1;
						break;
					} else {
						re = mi - 1;
						break;

					}
				}
			}
		}
	}

}
