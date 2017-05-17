import java.io.*;

public class bumm {
	
	public static void main (String args[]) throws IOException{
		int i=0, x=100, z1,z2,z3;
		
		
		for(;i<x;i++){
			
			z1 = i % 10;		
			z2 = ((i % 100)-z1)/10; 	
			z3 = ((i % 1000)-(z1+z2))/100;	
			
			if (i%7 == 0 || z1 == 7 || z2 == 7 || z3 == 7){
				System.out.println("Bumm - bei : "+i);
			}
		}
		
	}
	
}
