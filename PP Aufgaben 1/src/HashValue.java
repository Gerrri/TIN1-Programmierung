
public class HashValue {

	public static void main(String[] args){
		char c1='J',c2='A',c3='V',c4='A';
		int z1,z2,z3,z4;
		double hash,m=0.7;
		
		z1 = ((int)c1);
		z2 = ((int)c2);
		z3 = ((int)c3);
		z4 = ((int)c4);
		
		hash = (z1+z2+z3+z4)%m;
		
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(hash);
	}
	
	
	
}
