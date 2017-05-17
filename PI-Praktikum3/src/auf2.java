import java.io.*;

public class auf2 {

	public static void main(String args[]) throws IOException {
		int a[] = new int[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean wert=false;
		
		
		// Eingabe
		for (int i = 0; i < a.length; i++) {
			System.out.println(" [a] Stelle : " + i + " eingeben");
			a[i] = Integer.parseInt(in.readLine());
		}
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[i+1]){
				wert = true;
			}
			//else{wert=false;}
		}
		
		System.out.println(wert);
		
	}
}
