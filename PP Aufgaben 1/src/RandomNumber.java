import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		rndnum(s);

	}

	public static void rndnum(Scanner s) {

		int a = 42; // Basis
		int b = 23; // addiert
		int z = 0; // Zufallszahl & Multiplikaton mit Basis
		int m = 30; // Mod Zahl
		int x = 0; // durchläuft

		// Eingabe
		System.out.println("Wieviele Pseudozufallszahlen möchten Sie generieren?: 		(0 = eine zahl)");
		x = s.nextInt();
		x += 1;

		System.out.println("Geben Sie eine Zufällige, natürliche, positive Zahl ein : ");
		z = s.nextInt();

		if (z == (int) z) {

			for (int i = 1; x > i; i++) {
				z = (a * z + b) % m;
				System.out.println(z);
			}
		} else {
			System.out.println("Inkorekte eingabe, Bitte versuchen Sie es erneut");

		}

	}
}