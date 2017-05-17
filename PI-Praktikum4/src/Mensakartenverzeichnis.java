public class Mensakartenverzeichnis {
	Mensakarte ar[];
	
	
	Mensakartenverzeichnis(int anz){
		ar = new Mensakarte[anz];
	}
	
	
	public int hinzufuegen(Mensakarte b){
		
		for(int i=0;i<ar.length;i++){
			if(ar[i]==null){
				ar[i]=b;
				return i;
			}
		}
		
		return -1;
			
		}
}
