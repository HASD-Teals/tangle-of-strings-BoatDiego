package tangleOfStrings;

import java.util.Scanner;

public class TangleOfStrings {

	public static void main(String[] args) {
		System.out.println("Tangle of Strings");
		//Menu();
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
		boolean quit = false;
		while (quit == false) {	
		Scanner AskWord = new Scanner(System.in);
		System.out.println("Give me the word to absolutely destroy");
		String wordRecieve = AskWord.nextLine();
		System.out.print("You wrote "+wordRecieve);
		System.out.println();
		AskWord.close();
		
		//Use Case here 
		//		else {
			System.out.println("Restart Program, failed to understand number");
		}
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
		
	
	public static void caseInverse(String wordRecieve) {
		for(int i = 0; i < wordRecieve.length();i++){
			char Chara = wordRecieve.charAt(i);
			if (Chara >= 'A'&& Chara <='Z') {
				char Upper = wordRecieve.charAt(i);
				String UpperS = String.valueOf(Upper);
				System.out.print(UpperS.toLowerCase());
			}
			else if (Chara >= 'a'&&Chara <='z') {
				char lower = wordRecieve.charAt(i);
				String lowerS = String.valueOf(lower);
				System.out.print(lowerS.toUpperCase());
			}
			
			
		}
		
	}
	public static void vowels(String wordRecieve) {
		int count = 0 ;
		for (int i = 0; i<wordRecieve.length(); i++) {
			char vowe = wordRecieve.charAt(i);
			if (vowe == 'a'||vowe == 'e'||vowe == 'i'||vowe == 'o'||vowe =='u'||vowe =='A'||vowe == 'E'
				|| vowe =='I'||vowe =='O'||vowe == 'U'){
				//Adds another vowel
				count++;
				
			}
			}
		System.out.print("Number of Vowels: "+count);
	
	}
	
	public static void isMatch (String wordRecieve) {
		System.out.println("Let's see if your String matches mine...");
		if (wordRecieve.equals("Super Doggo")) {
			System.out.println("Your String matches mine");
		}
		else {
			System.out.println("Your String does not match mine and is deemed inferior");
		}
	}
	
	public static void findReplace (String wordRecieve) {
		//work on this part
		int begin = 0;
		int end = 5;
		String Target = wordRecieve.substring(begin, end);
		String Replace = wordRecieve.replace( Target, "doggo");
		System.out.print(Replace);
	}
}
