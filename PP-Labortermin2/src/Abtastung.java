public class Abtastung {

	public static void main(String args[]) {
		int q=0;
		float x, y;
		
		for(float i=2;i <=4;i=(float)(i+0.1)){
			x=(Math.round(10.0*i));
			x /= 10.0;
			
			y = (float)(20*(x*x) - 100*x + 129.5);
			q = (int) y;

			if(x==2.5){System.out.print("Minimum! - ");}
			
			System.out.println("x = "+x+"      f(x) = "+y+"       Quantisierung = "+q);
				
		}
	}

}
