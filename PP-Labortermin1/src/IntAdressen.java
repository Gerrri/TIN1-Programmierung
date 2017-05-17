import java.io.*;

public class IntAdressen {
	
public static void main(String args[]) throws IOException{
	
	int ip1, ip2, ip3, ip4, port;
	String symad;
	StringBuffer symadnew;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("IP block 1 eingeben: ");
	ip1 = Integer.parseInt(in.readLine());
	
	System.out.println("IP block 2 eingeben: ");
	ip2 = Integer.parseInt(in.readLine());
	
	System.out.println("IP block 3 eingeben: ");
	ip3 = Integer.parseInt(in.readLine());
	
	System.out.println("IP block 4 eingeben: ");
	ip4 = Integer.parseInt(in.readLine());
	
	System.out.println("Port eingeben: ");
	port = Integer.parseInt(in.readLine());
	
	System.out.println("Symbolische Adresse eingeben: ");
	symad = in.readLine();
	
	System.out.println(ip1+"."+ip2+"."+ip3+"."+ip4+":"+port+", "+symad);
	
	System.out.println("länge der Symbolischen adresse: "+symad.length());
	
	System.out.println("fängt die adresse mit www. an ? : "+symad.startsWith("www."));
	
	symadnew = new StringBuffer(symad);
	symadnew = symadnew.delete(0, 4);
	System.out.println("ersten 4 gekürzt : "+symadnew);
}

}
