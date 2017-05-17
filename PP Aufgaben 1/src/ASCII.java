import java.util.Scanner;

// Relavante zur Berwertung -> Siehe Markierung unten "##########" 

public class ASCII {

		public static void main (String[] args)
		{
			Scanner s = new Scanner(System.in);
			Alpha(s);
		}
	
		public static void Alpha (Scanner s)
		{
			char c, o;
			int x;
			
			
			System.out.println("Bitte geben Sie einen Großbuchstaben ein, der zwischen A & Z liegt");
			System.out.println("zum Beenden geben Sie eine klein 'a' ein und bestätigen Sie");
			c = s.next().charAt(0);
			
			if (c == 'a')
			{
				System.exit(0); 
			}
			
			else
			{
				//#############################################################
				//############ Relevant zur Bewertung Start ###################
				//#############################################################
				
				if (c <= 90 && c >= 65)
				{
					x = ((int)c);			//x wird der ASCII Wert von c Zugewiesen
					//System.out.println(x);
					
					if (x==89 || x==90)
					{
						x -= 24;
					}
					else
					{
						x += 2;					// +2 im Alphabet 
					}
					
					
					o = ((char)x);			// o wird gleich dem zuvor errechneten Buchstaben gesetzt
		
					//System.out.println(c);
					//System.out.println(x);
					System.out.println("Zwei Buchstaben weiter befindet sich '" +o + "'  :)");
					
					Alpha(s);
				}
				
				else
				{
					System.out.println("Ungültige eingabe");
					Alpha(s);
				}
				
				//#############################################################
				//############# Relevant zur Bewertung Ende ###################
				//#############################################################
				
			}
		}
}
