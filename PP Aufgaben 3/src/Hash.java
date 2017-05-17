import java.io.*;

public class Hash {

	public static void main(String[] args)throws IOException{
		String satz;
		double hash;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("geben Sie den zu verschlüsselnden satz ein!: ");
		satz = in.readLine();
				
		hash = Hashen(satz);	
			
		
		System.out.println("der Hash lautet: '"+hash+"'");
		
		}


	
	public static double Hashen (String x){
		int laenge, value=0, valueall=0;
		double m=17, Hashwert;
		
		
		laenge = x.length();
		
		
		for(int i=0;i<laenge;i++){
			
			value= ((int)x.charAt(i));
			
			valueall = valueall + value;
		
		}
		
		Hashwert = valueall%m;
		
		System.out.println(valueall);
		
		
		return Hashwert;
	}
	
	
}
