import java.io.*;

public class arrays {

	public static void main (String args[])throws IOException{
		int x=0,laenge=0,wert=0,temp1=0,temp2=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		do{
			System.out.println("Array länge ? (3-8)");
			x = Integer.parseInt(in.readLine());			
		}while(x < 3 || x > 8) ;
		
		int[] array = new int[x];
		
		laenge = array.length;
		
		for(int i = 0;i<laenge;i++){
			System.out.println("Zahl für Stelle '"+i+"' eingeben!");
			wert = Integer.parseInt(in.readLine());			
			
			array[i]=wert;
		}
		
		for(int i=0;i<laenge;i++){
			
			temp1 = array[i];
			
			for(int j=i+1;j<laenge;j++){
				
				temp2 = array[j];
				
				if(j == i){}
				
				else if(temp1 == temp2){
					System.out.println("Die zahl "+array[j]+" kommt mindestens 2 mal vor");
				}
				
				
			}
			
		}
		
		
		
	}
	
	
}
