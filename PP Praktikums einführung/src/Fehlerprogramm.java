
	import java.io.*;

	public class Fehlerprogramm {

	 public static void main(String args[]) throws IOException {
	 
	  double a, b, c;
	  double volumen;
	  
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	  System.out.println("Volumenberechnung f�r einen Quader");
	  System.out.println("Bitte eingeben (in cm, auch Nachkommastellen m�glich):");
	  System.out.print("Kantenl�nge a: ");
	  a = Double.parseDouble(in.readLine());
	  System.out.print("Kantenl�nge b: ");
	  b = Double.parseDouble(in.readLine());
	  System.out.print("Kantenl�nge c: ");
	  c = Double.parseDouble(in.readLine());
	  
	  volumen = a*b*c;
	  
	  System.out.println("\nVolumen: "+volumen+" cm^3 = "+volumen/10+" Liter");

	 }
	 
	}
	
	
