import java.io.*;

public class Position {

	public static void main (String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte posi;
		int Number;
		char returnnum;
		
		System.out.println("Geben Sie eine Ganzzahl ein, wo eine  bestimmte Bit stelle ermittelt werden soll :");
		Number = Integer.parseInt(in.readLine());
		
		System.out.println("Geben Sie die gewünschte stelle an! :(1 bis 32");
		posi = Byte.parseByte(in.readLine());
		posi -=1;
		
		returnnum = position(posi,Number);
		
		System.out.println("An stelle '" +(posi+=1)+"' befindet sich eine : '"+returnnum+"'");
		
		
		
	}
	
	public static char position (byte pos, int n){
		String bin;
		char back;
		int count;
		
		bin=(Integer.toBinaryString(n));
		
		
		
		count = bin.length();

		System.out.println(count);

		if (count < 32) {
			count = 32 - count;

			for (; count > 0; count--) {
				bin = ("0"+bin);
				
			}
		}
		
		back = bin.charAt(pos);
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("Zur Kontrolle Binary: /untere Zeile zum abzählen (immer 1-5)");
		System.out.println(bin);
		System.out.println("12345123451234512345123451234512");
		System.out.println("-------------------------");
		
		
		
		return back;
	}
	
}
