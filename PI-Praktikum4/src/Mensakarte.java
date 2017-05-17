
public class Mensakarte {
	double guthaben;
	String besitzer;
	boolean gesperrt;
	double value_Kaffee=1.20;
	
	//Mensakarte(){this(0.50, "TH");}
	
	
	//Konstruktor
	Mensakarte(double g,String b){
		guthaben = g;
		besitzer = b;
		gesperrt = false;
	}
	
	// Methode zum aufladen
	public void Aufladen(double betrag){
		if(betrag>0){
			guthaben += betrag;
		}
	}
	
	// Methode zum abfragen des Guthabens
	public double Guthaben_abfragen (){
		return guthaben;
	}
	
	
	//Methode zum Kaffee kaufen
	public boolean Buy_Kaffee(){
		double value_Kaffee=1.20;
		boolean state=false;
		
		if(guthaben>=value_Kaffee && gesperrt == false){
			guthaben -= value_Kaffee;
			state = true;
		}
		// else{state = false;}
		
		return state;
	}
	
	//Methode zum Essen kaufen
	public boolean Buy_Essen(double value_Essen){
		boolean state=false;
		
		if(guthaben>=value_Essen){
			guthaben -= value_Essen;
			state = true;
		}
		// else{state = false;}
		
		return state;
	}
	
	//Methode um anzahl Kaffee zu überprüfen
	public int Anzahl_Kaffee(){
		int anzahl;
		
		anzahl = (int) (guthaben/value_Kaffee);
		
		return anzahl;
	}
	
	// ändern des Sperr-zustands
	public boolean toggel(){
		
		if(gesperrt==false){
			gesperrt = true;
		}
		else{gesperrt = false;}
		
		
		return gesperrt;
	}
	
	//Methode Essen+Kaffe+anzahl
	
	public boolean essen_kaffee(double kos_essen, int anzahl){
		double ges_kosten;
		
		ges_kosten = (kos_essen+value_Kaffee)*anzahl;
		
		if(ges_kosten<=guthaben){return true;};
		
		return false;
	}
	
}
