import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detec{
	
	public static void main(String[] args) throws IOException 
	{
		int eingabe;
				
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Eingabe der Zahl: ");
		eingabe = Integer.parseInt(in.readLine());
		
		int i = eingabe;
		
		while(i>1)
		{
			
			int boo;
			i--;
			
			boo = eingabe % i;
			
			int x=0;
			
			if (boo == 0)
			{
				x++;
				System.out.println("Runde "+x);
			}
			else
			{
				System.out.println(eingabe + " ist keine Primzahl");
			}
			
		}
		
	}

}
