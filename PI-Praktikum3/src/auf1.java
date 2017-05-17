import java.io.*;

public class auf1 {
	
	public static void main(String args[])throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[5];
		int b[] = new int[5];
		boolean c[] = new boolean[5];
		boolean back;
		
		
		
		//Eingabe
		for(int i=0;i<a.length;i++){
			System.out.println(" [a] Stelle : "+i+" eingeben");
			a[i] = Integer.parseInt(in.readLine());
		}
		
		for(int i=0;i<b.length;i++){
			System.out.println(" [b] Stelle : "+i+" eingeben");
			b[i] = Integer.parseInt(in.readLine());
		}
		
		// Methode aufrufen
		back = arschlecken(a,b,c);
		
		if(back==true){

			//Ausgabe
			for(int i=0;i<a.length;i++){System.out.print(a[i]);}
			
			System.out.println("");
			
			for(int i=0;i<b.length;i++){System.out.print(b[i]);}
			
			System.out.println("");
			
			for(int i=0;i<c.length;i++){System.out.print(c[i]);}
			
			System.out.println("");
		}
		
		else{System.out.println("Arrays sind nicht gleich lang ! - FEHLER");}
	}
	
	
	public static boolean arschlecken(int a[],int b[],boolean c[]){
	
		if(a.length == b.length){
			for(int i=0;i<b.length;i++){
					c[i]=(a[i]==b[i]);
			}
			return true;
		}
		
		return false;
		
	}
		

}
