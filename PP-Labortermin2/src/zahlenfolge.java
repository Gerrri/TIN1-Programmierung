import java.io.*;

public class zahlenfolge {

	public static void main (String args[]) throws IOException{
		int x=99, z1,z2,z3;
		
		
		for(int i=0;i<x;i++){
			
			z1 = i % 10;		
			z2 = ((i % 100)-z1)/10; 	
			z3 = ((i % 1000)-(z1+z2))/100;	
			
			if (i%7 == 0 || z1 == 7 || z2 == 7 || z3 == 7){
				System.out.println("Bumm - bei : "+i);
			}
			else
			{
				System.out.println("no Bumm :( : "+i);
			}
		}
		
		
		for(int i=0;i<10;i++){
			
				for(int j=0;j<10;j++){
					
					if(j==7 || i ==7){
						System.out.println("BUMM! bei "+i);
					}
					else if(i==0&&j==0)
					{
						System.out.println(0);
					}
					
					else{
						int z,y,wert;
						
						z=j;
						y=(i*10);
						
						wert=z+y;
						wert=(wert%7);
						
						if(wert==0){
							System.out.println("Bumm"+j);
						}
						else{
							System.out.println((z+y));
						}
						
					}
				}		
					
			
			
			
			
		}
		
	}
	
}
