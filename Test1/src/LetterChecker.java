
public class LetterChecker {

	public boolean isletter(char sign) {
		boolean check = false;
		//om signs v�rde �r mellan a-z funkar det eller om v�rdet �r mellan A-Z
		if((sign>= 'a' && sign<='z') || (sign>='A' && sign<='Z'))
			check = true;
		
		return check;
		
	}

	
}
