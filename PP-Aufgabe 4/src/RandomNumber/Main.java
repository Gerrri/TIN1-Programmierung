package RandomNumber;
import java.io.*;

public class Main {

	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int wahl;
		int Seed;
		int anfang=0;
		int stop=0;
		RndNum Num = new RndNum(anfang);;
		
		
		do{
			System.out.println("Seed setzten | Press '1' & ENTER");
			System.out.println("Reset        | Press '2' & ENTER");
			System.out.println("ZZ erzeugen  | Press '3' & ENTER");
			System.out.println("");
			System.out.println("Zum Beenden drücken Sie '0' & ENTER");
			
			wahl = Integer.parseInt(in.readLine());
			
			switch(wahl){
				case 1: System.out.println("Geben Sie einen Ganzzahl Seed ein: ");
						Seed = Integer.parseInt(in.readLine());
						Num.setSeed(Seed); break;
				
				case 2: Num.reset();break;
				
				case 3: Num.nextRand();break;
				
				case 0: stop=1;break;
				
				default: System.out.println("|-----UNGÜLTIGE EINGABE!-----|");
						 break;
			}
	
			System.out.println("#################################################");
			System.out.println("#################################################"); 
			System.out.println(""); 
			System.out.println(""); 
			System.out.println(""); 
			System.out.println(""); 
			
				
		}while(stop==0);
		
		
	}
	
	
	
}
