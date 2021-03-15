
public class LetterChecker {

	public boolean isletter(char sign) {
		boolean check = false;
		//om signs värde är mellan a-z funkar det eller om värdet är mellan A-Z
		if((sign>= 'a' && sign<='z') || (sign>='A' && sign<='Z'))
			check = true;
		
		return check;
		
	}

	
}
