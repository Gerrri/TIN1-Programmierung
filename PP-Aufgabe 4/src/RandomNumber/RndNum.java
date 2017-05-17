package RandomNumber;
public class RndNum {
	private int aktuell, anfang;
	private int a=41; // Basis
	private int b=35; // addiert
	private int m=46534; // mod
	
	
	RndNum(int a,int b,int m){ // Wenn 3 Parameter übergeben werden
		this.a = a;
		this.b = b;
		this.m = m;
		aktuell=0;
	}
	
	RndNum(int anfang){ // Wenn 1 parameter übergeben wird
		this.anfang = anfang;
	}
	
	
	public void setSeed(int Seed) {
		aktuell = Seed;
		anfang = Seed;
	}
	
	public void reset(){
		aktuell = anfang;
	}
	
	public int nextRand(){
		
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("Die vorherige zufallzahl war: "+aktuell);
	
		aktuell = (a * aktuell + b) % m;
		
		System.out.println("Die aktuelle Zufallszahl ist: "+aktuell);
		System.out.println("--------------------------------------");
		System.out.println("");
		
		
		return aktuell;
	}
	
}
