import java.io.*;

public class arrayadd {
	
	public static void main (String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double[] e = new double[6];
		double erg;
		int leng=0;
		
		leng = e.length;
		
		System.out.println("Geben Sie 6 Zahlen ein :");;
		
		for(int i=0;i<leng;i++){
			System.out.println("Geben Sie Zahl "+(i+1)+" ein!");
			e[i] = Double.parseDouble(in.readLine());
		}
		
		erg = add(e);
		
		System.out.println("Ergebniss '"+erg+"' !");
		
		
	}
	
	public static double add (double[] eingabe){
		double erg=0,l=0;
		
		l=eingabe.length;
		
		for(int i=0;i<l;i++){
			erg += eingabe[i];
		}
		
		return erg;
	}

}
