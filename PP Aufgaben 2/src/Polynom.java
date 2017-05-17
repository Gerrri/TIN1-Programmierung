import java.io.*;

public class Polynom {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c;
		double x_links,x_rechts;
		double tempchange,spanne,abstand, x;
		double y;
		int k;
		
		
		System.out.println("Bitte geben sie den Koeffizienten a ein");
		a = Double.parseDouble(in.readLine()); 
		
		System.out.println("Bitte geben sie den Koeffizienten b ein");
		b = Double.parseDouble(in.readLine());
		
		System.out.println("Bitte geben sie den Koeffizienten c ein");
		c = Double.parseDouble(in.readLine());
		
		
		System.out.println("Bitte geben Sie die untere Intervallgrenzen an");
		x_links = Double.parseDouble(in.readLine());
		
		System.out.println("Bitte geben Sie die obere Intervallgrenzen an");
		x_rechts = Double.parseDouble(in.readLine());
		
		
		if (x_links>x_rechts){ // Tausche intervall fals x_links > x_rechts
			
			tempchange = x_links;
			x_links = x_rechts;
			x_rechts = tempchange;
		}
		
		System.out.println("Bitte geben Sie die Stützstellen an");
		k = Integer.parseInt(in.readLine());
		
		
		spanne = x_rechts - x_links;
		abstand = spanne /(k+1);
		x=x_links;
		
				
		do{
			
			y = a*x*x+b*x+c;
			System.out.println("f("+x+")="+y);
			x = x + abstand;
			
		}while(x <= x_rechts);
		
		
	}

}
