import java.io.*;

public class Mathode {
	public static void main(String args []) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int z1,z2,z3,aus;
		
		System.out.print("Bitte geben Sie Zahl 1 ein" );
		z1=Integer.parseInt(in.readLine());
		
		System.out.print("Bitte geben Sie Zahl 2 ein" );
		z2=Integer.parseInt(in.readLine());
		
		System.out.print("Bitte geben Sie Zahl 3 ein" );
		z3=Integer.parseInt(in.readLine());
		
		aus=lowest(z1,z2,z3);
		
		System.out.print("der kleinste wert ist : "+aus);
		
		
	}
	
	public static int lowest(int x1,int x2, int x3){
		int kleinste;
		
		kleinste = x1;
		
		if(x2<kleinste) kleinste = x2;
		if(x3<kleinste) kleinste = x3;
		
		return kleinste;
	}
	
}
