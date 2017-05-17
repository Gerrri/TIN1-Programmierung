import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int anzahl = 0; // durchläuft
		int z = 0; // Zufallszahl & Multiplikaton mit Basis
		int out=0;
		
		
		System.out.println("Geben Sie eine Zufällige, natürliche, positive Zahl ein : ");
		z = s.nextInt();
		
		System.out.println("Wieviele Pseudozufallszahlen möchten Sie generieren?:");
		anzahl = s.nextInt();
		
		if(anzahl==0){
			System.out.println("Die eingabe 0, macht einfach keinen sinn");
		}
		else{
			for (int i=0;i<anzahl;i++){
				if(i==0){
					out = rndnum(s,z);
					System.out.println("RndNumber: "+out);
				}
				else{
					out = rndnum(s,out);
					System.out.println("RndNumber: "+out);
				}
			}
		}
		
		
		
		
		


	}

	public static int rndnum(Scanner s, int z) {

		int a = 41; // Basis
		int b = 35; // addiert
		int m = 46534; // Mod Zahl

		z = (a * z + b) % m;
		
		return z;

	}
}
