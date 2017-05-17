
public class WertEinesFlags {

	public static void main(String[] args) {
		short flags;
		int count;
		byte k;
		String bin;
		char b;

		flags = 10; // Festlegung des flags (

		bin = Integer.toBinaryString(flags);

		System.out.println("Zur Kontrolle der Binär Code von " + flags + " : " + bin);

		count = bin.length();

		System.out.println(count);

		if (count < 16) {
			count = 16 - count;

			for (; count > 0; count--) {
				bin = ("0"+bin);
				
			}

			System.out.println(bin);

		}
		
		k = 14; // Welche Bittstelle soll ausgelesen werden ?
		b = (bin.charAt(k));
		System.out.println("Der " +k+ "te Bit ist eine '" +b+ "'");
		
	}
}
