package Parity;

import java.io.*;

public class Parity {
	
	
	
	public static void main (String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte fort=0;
		
		
		
do{		
		byte a[] = new byte[8];
		byte parycount=0,parycount2=0;
		byte parity=-1,parity2=-1;
		byte temp1=0;
		byte kippstelle=-1;

		for(int i=0;i<8;i++){
			do{
				System.out.println("Wert für stelle '"+i+"' eingeben!");
				a[i] = (byte) Integer.parseInt(in.readLine());
			}while (a[i] > 1 || a[i] < 0 );
		}
		
		
		// zählt einsen in array
		for(int i=0;i<8;i++){
			if (a[i]==1){parycount+=1;}
		}
	
		if(parycount%2==0){parity=0;}
		else{parity=1;}
	

		
		//araay ausgabe
		System.out.print("Array : ");
		for(int i=0;i<8;i++){
			System.out.print(a[i]);
		}
		System.out.println("");
		System.out.println("Parity = "+parity);
		
		
		System.out.println("Bit Kippen? -> 1+Enter");
		temp1 = (byte) Integer.parseInt(in.readLine());
		
		if(temp1==1){
			
			do{
			System.out.println("Kippe bit an stelle (0-7):");
			kippstelle = (byte) Integer.parseInt(in.readLine());
			}while (kippstelle<0 && kippstelle>8);
			
			if(a[kippstelle] == 1){
				a[kippstelle] = 0 ;
			}
			else{a[kippstelle]=1;}		
		}
		
		//araay ausgabe
		System.out.print("Array : ");
		for(int i=0;i<8;i++){
		System.out.print(a[i]);
		}
		System.out.println("");
		System.out.println("Parity = "+parity);
				
		
		
		
		
		// PRÜFEN !
		
		// zählt einsen in array
		for(int i=0;i<8;i++){
		if (a[i]==1){parycount2+=1;}
		}
	
		if(parycount2%2==0){parity2=0;}
		else{parity2=1;}
		
		
		if(parity2==0){
			if(parity2==0){System.out.println("Erfolgreiche Übermittlung");}
			else{System.out.println("FEHLER bei der Übermittlung!");}	
		}
		else{
			if(parity2==1){System.out.println("FEHLER bei der Übermittlung!");}
			else{System.out.println("Erfolgreiche Übermittlung");}	
		}
	
		System.out.println("zum wiederhoeln -> 1+ENTER");
		fort = (byte) Integer.parseInt(in.readLine());
		
}while(fort==1);	
		
		
	
	}
	
	
	
}
