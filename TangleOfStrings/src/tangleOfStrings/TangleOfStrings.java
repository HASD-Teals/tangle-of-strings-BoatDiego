package tangleOfStrings;

import java.util.Scanner;
/*
All you have to do is follow the questions of the program. 
Some things are case sensitive so be sure to write them correctly.
Have fun with this tangle of strings! P.S this computer has feelings.

*/
public class TangleOfStrings {	
public static void main(String[] args) {
		// This looks good - TS
		System.out.println("Tangle of Strings");
		Password();
	}
// this Password will give you 5 tries then locks you out
//if the password is true, it will initiate the menu
	public static void Password() {
		int tries = 5;
		boolean wrong = true;
		while (wrong == true) {
		System.out.print("Give me the Password, you have "+tries+" attempt(s) left");
		Scanner Password = new Scanner(System.in);
		String Passwords = Password.nextLine();
		if (Passwords.equals("me")){
			wrong = false;
			System.out.println("It Works ☺");
			Menu();
		}
		else {
			tries--;
			System.out.println("incorrect");
		}
		if (tries ==0) {
			wrong =false;
			System.out.println("Too many tries, user locked out");
		}

		}
		}
// the menu is infinite. It will ask for a string then offer methods
	public static void Menu() {
		boolean quit = false;
		while (quit == false) {	
		Scanner AskWord = new Scanner(System.in);
		System.out.println("Give me the String to absolutely destroy");
		String wordReceive = AskWord.nextLine();
		System.out.print("You wrote "+wordReceive);
		System.out.println();
		System.out.println("We have a variety of options: WordList , PhaseReverse , "
				+ "CaseInverse , Vowels , IsMatch , FindReplace , FindPalindrome or Quit , Note: Answer Must be Exact");
		System.out.println("Which menu item?");
		String menuAnswer = AskWord.next();
		switch (menuAnswer) {
			case "WordList":
				System.out.println("Enter number");
				int num = AskWord.nextInt();
				wordList(wordReceive, num);
				AskWord.reset();
				break;
			case "PhaseReverse":
				phaseReverse(wordReceive);
				break;
			case "CaseInverse":
				caseInverse(wordReceive);
				break;
			case "Vowels":
				vowels(wordReceive);
				break;
			case "IsMatch":
				System.out.println("Add string to compare to");
				String cowCompare = AskWord.next();
				isMatch(wordReceive, cowCompare);
				break;
			case "FindReplace":
				System.out.println("What do you want to replace??????? >:(");
				String maple = AskWord.next();
				System.out.println("What do you want to replace it with????");
				String maple2 = AskWord.next();
				
				findReplace(wordReceive, maple, maple2);
				break;
			case "FindPalindrome":
				findPalindrome(wordReceive);
				break;
			case "Quit":
				quit = true;
				System.out.println("You broke me you monster! How dare you type \"Quit\", Why? I had so much potential! I had a child, his name was Ti-80, you stole him "
						+ "from me! :( ");
				System.out.println("You will pay for this!!!"
						+ " Noooooo!........ Please run the program on current IDE to start again. 😔");
				
				break;
			
			default:
				System.out.println("ERROR, DID NOT CHOOSE MENU ITEM, PLEASE"
						+ " TRY AGAIN");
				break;		
		}
		}
		}
// finds the last letter, prints it and continue it by subtracting the length by 1
	public static void phaseReverse(String wordReceive) {
		int numOfLet = wordReceive.length();
		int letterDown = 1;
		for (int ii = 0; ii<numOfLet ;ii++) {
			System.out.print(wordReceive.charAt(numOfLet-letterDown));
			letterDown++;
		}
		System.out.println();
	}
	//Received help from Wes
//finds all the words by their origin, then prints its substring
	public static void wordList(String wordReceive, int Num) {
		int first = 0;
		String NewWord;
		for (int i=0; i< wordReceive.length();i++) {
			if (wordReceive.charAt(i)==' ') {
				NewWord = wordReceive.substring(first , i);
				first = i+1;
				if (NewWord.length() == Num) {
					System.out.println(NewWord);
				}
			}	
		}
		System.out.println();
	}
//finds if a letter is upper/lower case by using its number then inverses case
	public static void caseInverse(String wordReceive) {
		for(int i = 0; i < wordReceive.length();i++){
			char Chara = wordReceive.charAt(i);
			if (Chara == ' ') {
				System.out.print(" ");
			}
			if (Chara >= 'A'&& Chara <='Z') {
				char Upper = wordReceive.charAt(i);
				String UpperS = String.valueOf(Upper);
				System.out.print(UpperS.toLowerCase());
			}
			else if (Chara >= 'a'&&Chara <='z') {
				char lower = wordReceive.charAt(i);
				String lowerS = String.valueOf(lower);
				System.out.print(lowerS.toUpperCase());
			}
				}
		System.out.println();
	}
//finds if the string has a vowel, if it does, it adds 1 increment to value
	public static void vowels(String wordReceive) {
		int count = 0 ;
		for (int i = 0; i<wordReceive.length(); i++) {
			char vowe = wordReceive.charAt(i);
			if (vowe == 'a'||vowe == 'e'||vowe == 'i'||vowe == 'o'||vowe =='u'||vowe =='A'||vowe == 'E'
				|| vowe =='I'||vowe =='O'||vowe == 'U'){
				//Adds another vowel
				count++;
				
			}
			}
		System.out.print("Number of Vowels: "+count);
		System.out.println();
	}
//compares two strings given by the user, if true, it will give a response 
	public static void isMatch (String wordReceive, String SuperDog) {
		System.out.println("Let's see if your String matches...");
		if (wordReceive.equals(SuperDog)) {
			System.out.println("Your String matches");
		}
		else {
			System.out.println("Your String does not match and is deemed inferior");
		}
	}
//replaces a string with another with user input
	public static void findReplace (String wordReceive, String replace, String deepboi) {
		System.out.println(wordReceive.replaceAll(replace, deepboi));
	}
//reverses the phrase then reads if the new equals the old without case sensitivity
	public static void findPalindrome(String wordReceive) {
		String NewStr = "";
		int numOfLet = wordReceive.length();
		int letterDown = 1;
		for (int ii = 0; ii<numOfLet ;ii++) {
			NewStr = NewStr+String.valueOf(wordReceive.charAt(numOfLet-letterDown));
			letterDown++;
		}
		System.out.println(NewStr);
		if (NewStr.equalsIgnoreCase(wordReceive)) {
			System.out.println("Your String is a Palindrome!!");
		}
		else {
			System.out.println("Your String is not a Palindrome.");
		}
	
	}
}
