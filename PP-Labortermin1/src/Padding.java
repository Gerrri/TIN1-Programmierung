import java.io.*;

public class Padding {

	public static void main(String args[]) throws IOException {
		double l, p;
		int n, k, gl;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Geben sie die länge des Pakets an (l):");
		l = Double.parseDouble(in.readLine());

		System.out.println("Geben sie die Hochzahl an (n):");
		n = Integer.parseInt(in.readLine());

		k = (int) Math.ceil(l / Math.pow(2, n));
		System.out.println("k ist :" + k);

		gl = (int) (k * Math.pow(2, n));
		System.out.println("gl ist : " + gl);

		p = gl - l;
		System.out.println("p ist : " + p);

	}

}
