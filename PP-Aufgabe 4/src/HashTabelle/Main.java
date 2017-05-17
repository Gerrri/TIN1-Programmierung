package HashTabelle;

import java.io.*;

public class Main {
	
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int laenge=100,stop =1,eingabe=0,pos;
		String s;
		boolean bo;
		Hashtab h = new Hashtab(laenge);
		
		
		do{
			System.out.println("store String | Press '1' & ENTER");
			System.out.println("search String| Press '2' & ENTER");
			System.out.println("delete String| Press '3' & ENTER");
			System.out.println("");
			System.out.println("Zum Beenden drücken Sie '0' & ENTER");
			
			eingabe = Integer.parseInt(in.readLine());
			
			switch(eingabe){
			case 1: System.out.println("Enter String to store: ");
					s = in.readLine();
					bo = h.store(s);
					
					if(bo==false){System.out.println("WARNUNG : Speicherplatz belegt");}
					
					break;
			
			case 2: System.out.println("Enter String to search: ");
					s = in.readLine();
					pos = h.search(s);
					if(pos!=-1){System.out.println("String is @ position : '"+pos+"'");}
					else{System.out.println("Kein Treffer!");}
					break;
			
			case 3: System.out.println("Enter String to delete: ");
					s = in.readLine();
					h.delete(s);
					break;
			
			case 0: stop=0;break;
			
			default: System.out.println("|-----UNGÜLTIGE EINGABE!-----|");
					 break;
		}
			
			
			System.out.println("#################################################");
			System.out.println("#################################################"); 
			System.out.println(""); 
			System.out.println(""); 
			System.out.println(""); 
			System.out.println(""); 
			
			
		}while(stop==1);
		
	}
	
}
