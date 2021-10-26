package tangleOfStrings;

import java.util.Scanner;

public class TangleOfStrings {

	public static void main(String[] args) {
		System.out.println("Tangle of Strings");
		Password();
		//Password();
		//wordList("This is all i need");
	}

	public static void Password() {
		System.out.print("Give me the Password");
		Scanner Password = new Scanner(System.in);
		String Passwords = Password.nextLine();
		if (Passwords.equals("me")){
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
		//add quit if 
		System.out.println("Which menu item?");
		String menuAnswer = AskWord.next();
		switch (menuAnswer) {
			case "WordList":
				wordList(wordRecieve);
				AskWord.reset();
				break;
			case "PhaseReverse":
				phaseReverse(wordRecieve);
				break;
			case "CaseInverse":
				caseInverse(wordRecieve);
				break;
			case "vowels":
				vowels(wordRecieve);
				break;
			case "IsMatch":
				isMatch(wordRecieve);
				break;
			case "FindReplace":
				System.out.println("What do you want to replace??????? >:(");
				String maple = AskWord.next();
				System.out.println("What do you want to replace it with????");
				String maple2 = AskWord.next();
				
				findReplace(wordRecieve, maple, maple2);
				break;
			case "Quit":
				quit = true;
				System.out.println("You broke me you monster! Why? I had so much potential! I had a child, his name was Ti-80, you stole him "
						+ "from me! :( ");
				System.out.println("You will pay for this!!!"
						+ " Never log back in!");
				//add sad face
				break;
			
			default:
				System.out.println("ERROR, DID NOT CHOOSE MENU ITEM, PLEASE QUIT AND"
						+ " TRY AGAIN");
				break;
				
				
		}
		
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
	
	//Word list 
	public static void wordList(String wordRecieve) {
		if (wordRecieve.contains(" ") ) {
		for (int i =0; i<wordRecieve.length();i++) {
			char a = wordRecieve.charAt(i);
			if (a == ' ') {
				System.out.println(wordRecieve.substring(i-1));
				
				break;
			}
			else {
				System.out.println(wordRecieve.substring(0,3));
			}
		}
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
	
	public static void findReplace (String wordRecive, String replace, String deepboi) {
		System.out.println(wordRecive.replaceAll(replace, deepboi));
		
	}

	
}
