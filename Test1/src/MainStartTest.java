	import java.util.Scanner;

public class MainStartTest {

	public static void main(String[] args) {
		String EnglishLowerCase = ("abcdefghijklmnopqrstuvxyz");
		String EnglishCaps = ("ABCDEFGHIJKLMNOPQRSTUVXYZ");
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		scan.close();
		
		//kollar om input finns i någon av Stringarna.
		if(EnglishLowerCase.contains(input) ||EnglishCaps.contains(input))
				System.out.println("Letter does exist.");
		else
			System.out.println("Input is not a letter");

		
		
	}
}
