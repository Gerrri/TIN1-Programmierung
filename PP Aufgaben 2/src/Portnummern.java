import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Portnummern {
	
	public static void main (String[] args) throws IOException {
	int repeat;
	
	do{	
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Welche Port soll analysiert werden?");
			int port_num = Integer.parseInt(in.readLine());
			
			if (port_num <= 1023 && port_num > 0){
				
				System.out.println("Es handelt sich um einen 'Well known Port' ! ");
				
				switch (port_num){
					case 21 :
							System.out.println(" -> den FTP Port");
							break;
					case 23 :
							System.out.println(" -> den Telnet Port");
							break;
					case 25 :
							System.out.println(" -> den SMTP Port");
							break;
					case 80 :
							System.out.println(" -> den HTTP Port");
							break;
					case 143:
							System.out.println(" -> den IMAP Port");
							break;
							
					default: System.out.println("-> und gehört zu den Sonstigen Diensten");
					
				};
			}
			
			else if (port_num >= 1024 && port_num <= 49152){
				System.out.println("Es handelt sich um einen 'registered Port' ! ");
			}
			
			else if (port_num >= 49153 && port_num <= 65535){
				System.out.println("Es handelt sich um einen 'dynamic port' ! ");
			}
			
			else{
				System.out.println("Die eingabe ist ungueltig");
			}
			
			
			System.out.println("Zum wiederholen Tippen Sie 1 ein - abbruch = beliebige eingabe");
			repeat = Integer.parseInt(in.readLine());
			
		}while (repeat == 1);

		
		
	}
}
