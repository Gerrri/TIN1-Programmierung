import java.io.*;

public class EinfachesProgramm{
	public static void main(String args[]) throws IOException {
		int x, y, z, resultat;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Bitte Operand x eingeben: ");
		x = Integer.parseInt(in.readLine());

		System.out.println("Bitte Operand y eingeben: ");
		y = Integer.parseInt(in.readLine());

		System.out.println("Bitte Operand z eingeben: ");
		z = Integer.parseInt(in.readLine());

		resultat = (x + y + z) / 3;

		System.out.println("Resultat: " + resultat);

	}

	/*
	 * public static void main (String args[]) throws IOException { double x, y,
	 * z, resultat; BufferedReader in = new BufferedReader (new
	 * InputStreamReader (System.in));
	 * 
	 * System.out.println("Bitte Operand x eingeben: "); x =
	 * Double.parseDouble(in.readLine());
	 * 
	 * System.out.println("Bitte Operand y eingeben: "); y =
	 * Double.parseDouble(in.readLine());
	 * 
	 * System.out.println("Bitte Operand z eingeben: "); z =
	 * Double.parseDouble(in.readLine());
	 * 
	 * 
	 * resultat = (x+y+z)/3;
	 * 
	 * System.out.println("Resultat: "+resultat);
	 * 
	 * }
	 */

	/*
	 * Aufgabe V.1.2:
	 * 
	 * Die Rechnung ist nur durch den INT Wert falsch, da nachkommastellen nicht
	 * angezeigt werden können und auch kein Rest angegebn wird.
	 * 
	 * D.h. bei z.B. (2+2+3)/3 ergibt sich "2" und nicht 2,33 bzw 2 Rest 1.
	 * 
	 * Das könnte man als Rechenfehler ansehen.
	 * 
	 */

}
