package PPAufagben4;

public class astrrray {

	public static void main (String[] args){
		String[] a = new String[5];
		
		
		for(int i=0;i<5;i++){
			a[i]=("null");
			System.out.println(a[i]);
		}
		
		for(int i=0;i<5;i++){
			if(a[i] == null) {System.out.println("ist null");}
		}
		
	}
	
	
}
