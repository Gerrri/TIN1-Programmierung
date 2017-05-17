import java.io.*;

public class halbieren {
	public static void main(String args[]) throws IOException {
		
		
		/*
		 * Das Script, ermittelt wie oft eine Zahl halbiert werden kann, bis Sie
		 * kleiner als 1 ist.
		 */
		
		
		int n;
		int k = 0;
		int fort = 1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		do {

			do {
				System.out.println("Bitte geben Sie den zu halbierenden Wert ein!");
				n = Integer.parseInt(in.readLine());
			} while (n < 1);

			while (n > 1) {
				n = n / 2;
				k += 1;
			}

			System.out.println("Der wert konnte " + k + " mal halbiert werden");

			System.out.println("Bitte geben Sie 1 ein um den Vorgang zu wiederholen!");
			fort = Integer.parseInt(in.readLine());

		} while (fort == 1);

	}

}
