package tangleOfStrings;

import java.util.Scanner;

public class TangleOfStrings {

	public static void main(String[] args) {
		System.out.println("Tangle of Strings");
		Menu();
		//Password();
		
		
	}

	public static void Password() {
		System.out.print("Give me the Password");
		Scanner Password = new Scanner(System.in);
		String Passwords = Password.nextLine();
		if (Passwords.contains("me")) {
			System.out.print("It Works ☺");
			Menu();
		}
		Password.close();
	}
	
	
	public static void Menu() {
		Scanner AskWord = new Scanner(System.in);
		System.out.println("Give me the word to absolutely destroy");
		String wordRecieve = AskWord.nextLine();
		System.out.print("You wrote "+wordRecieve);
		System.out.println();
		System.out.println("You get:");
		phaseReverse(wordRecieve);
		AskWord.close();
		
		Scanner Menu = new Scanner (System.in);
		int Menus = Menu.nextInt();
		if (Menus == 1) {
			phaseReverse(wordRecieve);
		}
		
		else if (Menus ==2) {
			
		}
		else if (Menus ==3 ) {
			
		}
		else if (Menus == 4) {
			
		}
		
		else if (Menus ==5 ) {
			
		}
		else if (Menus == 6) {
			
		}
		else if (Menus == 6) {
			
		}
		else if (Menus == 7) {
			
		}
		else if (Menus == 8) {
			
		}
		else {
			System.out.println("Restart Program, failed to understand number");
		}
		Menu.close();
	}
	
	/*public static String wordRecives() {
		System.out.println("Tangle of Strings");
		Scanner AskWord = new Scanner(System.in);
		System.out.println("Give me the word to absolutely destroy");
		String wordRecieve = AskWord.nextLine();
		System.out.print("You wrote "+wordRecieve);
		System.out.println();
		System.out.println("You get:");
		phaseReverse(wordRecieve);
		AskWord.close();
		return wordRecieve;
		
	}
	*/
	
	public static void phaseReverse(String wordRecieve) {
		int numOfLet = wordRecieve.length();
		int letterDown = 1;
		for (int ii = 0; ii<numOfLet ;ii++) {
			System.out.print(wordRecieve.charAt(numOfLet-letterDown));
			letterDown++;
		}
		
	}
	public static void wordList(String wordRecieve) {
	//System.out.println
		if (wordRecieve.contains(" ") ) {
		
	}
		
		
	}
	
	public static void vowels() {}
}

