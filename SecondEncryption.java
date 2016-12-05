
import java.net.Inet4Address;

public class SecondEncryption implements Chiffrierung{
	String al ="abcdefghijklmnopqrstuvwxyz";
	char[] alphapet = al.toCharArray();
	
	char [] m ;
	public SecondEncryption(char[] m) {
		super();
		this.m = m;
	}

	

	@Override
	public char chiffrieren(char  zeichen) {

		for (int i = 0; i < alphapet.length; i++) {
			if (alphapet[i] == zeichen) {
				return (char) i;
				
		}
		}
		return zeichen;
		
		
		
	}

	@Override
	public char dechiffrieren(char zeichen) {
		

		return 0;
	}


	
	public String printChiffriereng() {
		String result = "" ;
		char temp;
		int k;
		for (int i = 0; i < m.length; i++) {
			 temp =chiffrieren(m[i]);
			
			if (temp==0||temp==1||temp==2||temp==3||temp==4||temp==5||temp==6||temp==7||temp==8||temp==9||temp==10||temp==11||temp==12||temp==13
					||temp==14||temp==15||temp==16||temp==17||temp==18||temp==19||temp==20||temp==21||temp==22||temp==23||temp==24||temp==25) {
				k=temp;
				result=result+"m["+k+"]";
			}else{
			
			result=result+chiffrieren(m[i]);
			}
			
		}
		return result;
	}
	public String printDechiffriereng() {
		char temp1;
		char temp2;
		String tempString ="";
		int tempint;
		String result = "" ;
		int loop;
		
		for (int i = 0; i < m.length; i++) {
			if (m[i]=='m') {			
				if (m[i+1]=='[') {
					
					temp1=m[i+2];
					tempString=Character.toString(temp1);
					if (m[i+3]!=']') {
						loop=4;
						temp2=m[i+3];
						tempString=Character.toString(temp1)+ Character.toString(temp2);
					}else{
					loop=3;
					}
					tempint=Integer.valueOf(tempString);
					result=result+alphapet[tempint];
					i=i+loop;
					continue;
				}
				
				
			}else{
				result=result+m[i];
			}
			
			
			
		}
		return result;
	}

	
}
