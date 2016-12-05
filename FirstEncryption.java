
public class FirstEncryption implements Chiffrierung {

	private int Stellenzahl;
	public FirstEncryption(int stellenzahl) {
		super();
		Stellenzahl = stellenzahl;
	}

	String al ="abcdefghijklmnopqrstuvwxyz";
	char[] alphapet = al.toCharArray();
	@Override
	public char chiffrieren(char zeichen) {
		
		for (int i = 0; i < alphapet.length; i++) {
			if (alphapet[i] == zeichen) {
				if (i>25-Stellenzahl) {return alphapet[(i+(Stellenzahl-1)-25)];}
				
				zeichen=alphapet[i+Stellenzahl];
				
				break;
			
		}
		}
		return zeichen;
		
		
	}

	@Override
	public char dechiffrieren(char zeichen) {
		for (int i = 0; i < alphapet.length; i++) {

		if (alphapet[i] == zeichen) {
			if (i<25-(25-Stellenzahl)) {return alphapet[25-(Stellenzahl-(i+1))];}

			zeichen=alphapet[i-Stellenzahl];
			
			break;
		
	}
	}
	return zeichen;
	}
}
