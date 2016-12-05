
public class Test {

	public static void main(String[] args) {
		String test = "this is A Very impotant message44";
		char[] ch = test.toCharArray();
		FirstEncryption text = new FirstEncryption(3);

		for (int i = 0; i < ch.length; i++) {
			System.out.print(text.chiffrieren(ch[i]));
			
		}
	System.out.println();
		String k ="Tm[7]m[8]m[18] m[8]m[18] m[21]m[4]m[17]m[24] Im[12]m[15]m[14]m[19]m[0]m[13]m[19]443";
	char[] s = k.toCharArray();
	
	SecondEncryption sec = new SecondEncryption(s);
	System.out.print(sec.printDechiffriereng());
	
	
	
	}

}
