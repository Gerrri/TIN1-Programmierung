package HashTabelle;

public class Hashtab {
	private String[] words;
	
	Hashtab(int a){
		words = new String[100];
	}
	
	public boolean store(String s){
		boolean available=false;
		int m,hashwert,value,valueall=0;
		
		
		m = s.length(); // länge vom string = modulus
		
		
		// Hashwert ermitteln
		for(int i=0;i<m;i++){
			value= ((int)s.charAt(i));
			valueall = valueall + value;
		}
		
		hashwert = valueall%m;
		
		if(words[hashwert]==null){
			words[hashwert]= s;
			System.out.println("STATUS : String an stelle '"+hashwert+"' gespeichert");
			System.out.println("String: "+words[hashwert]);
			
			available = true;
		}
		
		else{
			available = false;
		}
		
		return available;
	}
	
	
	
	public int search(String s){
		int position=-1,laenge;
		
		laenge = 100;
		
		for(int i=0;i<laenge;i++){
			if(words[i]!=null){
				if(words[i].equals(s)){
					position = i;
					System.out.println("Treffer!");
					break;
				}
			}
		}
		
		return position;
	}
	
	
	public void delete(String s){
		int laenge;
		
		laenge = 100;
		
		for(int i=0;i<laenge;i++){
			if(words[i]!=null){
				if(words[i].equals(s)){
					words[i]= null;
					System.out.println("STATUS : String an stelle '"+i+"' gelöscht");
				}
		}
		}
	}
	
	
	
}
