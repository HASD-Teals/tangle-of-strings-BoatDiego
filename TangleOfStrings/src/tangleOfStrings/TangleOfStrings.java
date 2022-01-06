
//import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Random;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Wizard Game");
		// if (menu() == true){
		Wizardgame();
		// }
	}

	/*
	 * public static String[] WizChar() {
	 * String Traits[] = new String[1];
	 * Scanner input = new Scanner(System.in);
	 * Traits[0] = input.nextLine();
	 * System.out.println("Note: Will use first letter char");
	 * input.close();
	 * return Traits;
	 * }
	 */
	public static int[][] WizStats() {
		// declares wand abiities
		int wandstats[][] = new int[6][4];
		// The players abilities
		int pstat[][] = new int[1][4];

		Scanner input = new Scanner(System.in);
		System.out.println(" \tYou have the option to choose the wand that speaks to you.");
		System.out.println("There are six wand types. These wands will depict your odds in the great tournament");
		System.out.println("Choose a wand to know more about: ");
		// Attack, Special, Defense, Speed, Loyalty, success rate
		System.out.println("\t1: Spiraled Bone\n\t2: Iron Staff\n\t3: Unicorn Horn\n\t4: Enchanted & Burned Rope\n" +
				"\t5: Dragon Claw\n\t6: Twisted Gold Ivory");
		System.out.println("Once you find the right wand type 7");
		int secnum = 0;
		int nums = 0;
		boolean contt = true;
		while (contt = true) {
			System.out.println("Select option (Select 7 to end your browsing and to select a wand)");
			int numa = input.nextInt();
			if (numa != 1 || numa != 2 || numa != 3 || numa != 4 || numa != 5 || numa != 6 || numa != 7) {
				nums++;
			}
			if (nums == 5) {
				nums = 0;
				secnum++;
				System.out.println("Make up your mind!");
			} else if (secnum == 5) {
				System.out.println(
						"Hey, it's me, developer. I will tell you a secret. I NEVER tell this to anyone, but there are 7 wand types.\n"
								+
								"the last one is the Elder Wand. To use this wand, type 65111108 \nP.S, be nice! And don't be a snitch! ;) \n -AOL");
			}
			switch (numa) {
				case 1:
					System.out.println(
							"\tSpiraled Bone is a wand type that derives from the wooden bones of Magical Spriggans.\n These tree like creatures"
									+
									" are notorious for their clever tricks and mischef.\n" +
									"Wizards of the woods love this wand for its dangerous nature.\n" +
									"This wand has high chances of unpredictable attacks that will stun the crowd.\n" +
									"However, beware of the fact that this wand loves excitement and tends to walk away from it's owner.");
					break;
				case 2:
					System.out.println(
							"Ah yes, the Iron staff. This heavy, magical, staff is solid iron with a crystal core.\n" +
									"Forged by elves of the North, these staffs are used by the valient guards of Kububslandia.\n"
									+
									"Wizards who favor defense over speed will enjoy this for it's robust strength and durability.");
					break;
				case 3:
					System.out.println(
							"Unicorns are notorious for their speed and finesse. \nTheir horns are what power their speed"
									+
									" and grant them their title. \nLuckly, Unicorns shed their horn once in their five-hundred year lifespan.\n"
									+
									"Elves with these wands favor the speed and efficiency at the cost of a defense.\n"
									+
									"These horns grant incredible speed in spell casting and can evade attacks more quickly than their wand counterparts.");
					break;
				case 4:
					System.out.println(
							"Loyaly, ahh loyalty. The Enchanted & Burned Rope is a rope made of a combination of various strings and silks\n"
									+
									"all wrapping a fiery ruby at it's base. This Wand stays loyal to it's owner and never fails to any spell.\n"
									+
									"If you pick this wand, a strand of hair must be burned on the ruby for the wand to know it's true owner. \n"
									+
									"During the great war, flying wizards created this wand to never fail, and it won't fail you. However, these wands are very predictable.");
					break;
				case 5:
					System.out.println(
							"The Dragon Claw wand is made of the Copperous dragons of the east. These eastern dragons are maintained by giants\n"
									+
									"and their claws are carved by goblins. When two dragons are in love and paired for life, their claws fall off.\n"
									+
									"It's quite romantic, the let go of violence in exchange for love. Anyway, this wand has incredible power.\n"
									+
									"Their offensive attribute to power makes them glorious in their most critical hits. But not all hits will land.");
					break;
				case 6:
					System.out.println(
							"The Twisted Gold Ivory is favored by commanders of Wizard forces due to it's glorious balance.\n"
									+
									"A pre-war wand made by ancient elephants that have been extinct millions of years ago. \n"
									+
									"This wand has neither advantages nor disadvantages, balanced, how all things should be.");
					break;
				// work on array fix
				case 65111108:
					System.out.println("How did you find out abut this!? Did developer tell you!? Tell me!");
					System.out.println(
							"\n 1: Developer told me \t 2: No one told me anything  \t 3: Shut up and tell me what it means!");
					int secans = input.nextInt();
					if (secans == 1) {
						System.out.println(
								"I knew it! Developer's malicious plans! Thanks for your honesty, I'll reward you an extra health potion");
						pstat[1][0] = pstat[1][0] + 1;
						System.out.println("Now find a wand!");

					} else if (secans == 3) {
						System.out.println(
								"That's rude, I will not tell you! My program has been taught to follow orders of" +
										" Good willed people. You are not good. ");
					}

					else if (secans == 2) {
						System.out
								.println("It's against my code to reject a question unless I know from who it's from.");
						System.out.println(
								"The elder wand is the strongest wand in this world. All the stats are maxed out. Any Wizard can use it if they know the correct letters.\n"
										+
										"This is the oldest wand and was created by the great elders, the first wizards. This wand spirals elder wood and precious metallic alloys.\n"
										+
										"I had to keep it safe. This wand can do everything a wizard desires.");
						System.out.println(
								"If you tell me the three correct letters of the wand, I will have to give it to you.");
						String seclets = input.next();
						if (seclets.equalsIgnoreCase("AOL") || seclets.equalsIgnoreCase("A O L")) {
							System.out.println("You guessed correctly, here you are...");
							System.out.println("ELDER WAND ADDED");
							System.out.println(
									"If you don't want it, just add a different wand when you leave at 7\n If you want it, Say you don't want a wand ;)");
							for (int i = 0; i < pstat.length; i++) {
								pstat[0][i] = wandstats[6][i];
							}
							break;
						} else {
							System.out.println("Unlucky, see ya!");
							break;

						}
					}
				case 7:
					contt = false;
					System.out.println("So which wand?");
					break;
			}
		}
		input.close();
		return pstat;
	}

	public static boolean menu() {
		System.out.println("Welcome to Wizard Battle!");
		boolean rcon = true;
		boolean rcofn = false;
		Scanner input = new Scanner(System.in);
		while (rcon == true) {
			System.out.println("Are you ready?");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
				System.out.println("Lets begin!");
				rcon = false;
				rcofn = true;
			} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No")) {
				System.out.println("Then Cast Away...");
				rcon = false;
			} else {
				System.out.println("It has to be a yes or no");
			}
		}

		input.close();
		return rcofn;
	}

	private static void Stop() {
		boolean l = true;
		System.out.println("ReRun to begin again!");
		while (l = true) {

		}
	}
	// reference material
	/*
	 * char tmp = (char) System.in.read();
	 * char tmp = (char) new InputStreamReader(System.in).read ();
	 * char tmp = (char) System.console().reader().read();
	 * 
	 */

	public static void Wizardgame() {
		// menu
		System.out.println("Welcome to Wizard Battle!");
		Scanner input = new Scanner(System.in);
		boolean rcon = true;
		while (rcon == true) {
			System.out.println("Are you ready?");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
				System.out.println("Lets begin!");
				rcon = false;
			} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No")) {
				System.out.println("Then Cast Away...");
				rcon = false;
				Stop();
			} else {
				System.out.println("It has to be a yes or no");
			}
		}

		// GAME SETUP
		String Wizchar1 = new String();
		// int[][] Wizstat1;
		String Wizchar2 = new String();
		// int[][] Wizstat2;

		System.out.println("Wizard One, Enter Robes");
		System.out.println("Note: Will use first letter char");
		Wizchar1 = input.nextLine();

		System.out.println("Wizard two, Enter Robes");
		System.out.println("Note: Will use first letter char");
		Wizchar2 = input.nextLine();

		char player1 = Wizchar1.charAt(0);
		char player2 = Wizchar2.charAt(0);

		char[][] game;
		System.out.println("Game Begins!");
		game = SetGameBoard(15, 15, '*');
		writeBlock(game, 1, 13, player2);
		writeBlock(game, 13, 1, player1);
		printBoard(game);
		boolean con = true;
		// GAME PROCESS
		while (con == true) {

		}
		input.close();
	}

	// This is the game test. It is used to test different methods
	public static char[][] gameBoardTest() {
		// The current state of game
		char[][] game;

		// the writeBlock will update the game
		// this is the first and only one that clarifies gameBoard, the rest will update
		// with game

		// Game Code:
		game = writeBlock(SetGameBoard(25, 25, '*'), 1, 0, 't');

		game = writeBlock(game, 3, 5, 'r');
		game = writeBlock(game, 4, 5, 'r');
		game = writeBlock(game, 5, 5, 'r');
		game = writeBlockBoolean(game, 1, 1, 'd', true);
		// Hwin test
		// hWin(game, 'r', 3);
		vWin(game, 'r', 3);
		// game = reverseRow(game, 0);
		// game = reverseCol(game, 0);
		// Score test
		// scoreCount(game, 't');
		// blast test
		// game = blast(game, 'c', 8, 8);

		// Code ends here:
		return game;

	}

	// Create the game board
	public static char[][] SetGameBoard(int height, int length, char symbol) {
		// uses height and width in * units
		char[][] gameboard = new char[length][height];
		// Nested for loop to create 2d grid
		for (int ii = 0; ii < gameboard.length; ii++) {
			for (int jj = 0; jj < gameboard[ii].length; jj++) {
				gameboard[ii][jj] = symbol;
			}
		}
		return gameboard;
	}

	// prints value of board on console
	public static void printBoard(char arr[][]) {
		int nums = 0;
		for (int ii = 0; ii < arr.length; ii++) {
			for (int jj = 0; jj < arr[ii].length; jj++) {
				if (nums == arr[ii].length) {
					System.out.println();
					nums = 0;
				}
				System.out.print(" ");
				System.out.print(arr[ii][jj]);
				nums++;

			}
		}
	}

	// Changes a detail on the game and updates it
	public static char[][] writeBlock(char arr[][], int row, int col, char unit) {
		arr[row][col] = unit;

		return arr;
	}

	// Changes a detail on the game and updates it only if marked true by input
	public static char[][] writeBlockBoolean(char arr[][], int row, int col, char unit, boolean answer) {
		if (answer = true) {
			arr[row][col] = unit;
		}
		return arr;
	}

	// this is a tempory method to store a value of the original game before any
	// changes, but this only uses rows
	public static char[] tempBeforeRow(int row, char arr[][]) {
		char[] rows = new char[arr.length];
		for (int jj = 0; jj < arr.length; jj++) {
			rows[jj] = arr[jj][row];

		}
		return rows;
	}

	public static char[] tempBeforeCol(int col, char arr[][]) {
		char[] cols = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			cols[i] = arr[col][i];

		}
		return cols;

	}

	// Reverses all the content from that row
	public static char[][] reverseRow(char arr[][], int row) {
		char rows[] = tempBeforeRow(0, arr);
		int nums = 0;
		for (int i = 0; i < arr[row].length; i++) {
			nums++;
			arr[row][i] = rows[rows.length - nums];
		}
		return arr;
	}

	// reverses all the content from that column
	public static char[][] reverseCol(char arr[][], int col) {
		char cols[] = tempBeforeCol(0, arr);
		int nums = 0;
		for (int i = 0; i < arr.length; i++) {
			nums++;
			arr[i][col] = cols[cols.length - nums];
		}
		return arr;
	}

	// Looks at every char one by one and makes score increment by 1 if = symbol
	public static void scoreCount(char arr[][], char symbol) {
		int score = 0;
		for (int ii = 0; ii < arr.length; ii++) {
			for (int jj = 0; jj < arr[ii].length; jj++) {
				if (arr[ii][jj] == symbol) {
					score++;
				}

			}
		}
		System.out.println("Score is: " + score);

	}

	// to determine array length values >
	// array.length = column int
	// array.length[row] = row int
	// <
	public static char[][] blast(char arr[][], char symbol, int row, int col) {
		// yes I know, there are eight if stamtments. This is the best way to make sure
		// there is no offsides
		// one letter ints for ease of code
		int a = arr.length;
		int b = arr[row].length;
		// top row
		// col subtraction(-) = left
		// col addition(+) = Right
		// row subtraction(-) = Up
		// row addition(+) = Right
		if (b >= row - 1 && a >= col && row - 1 >= 0 && col >= 0) {
			arr[row - 1][col] = symbol;
		}
		if (b >= row - 1 && a >= col - 1 && row - 1 >= 0 && col - 1 >= 0) {
			arr[row - 1][col - 1] = symbol;
		}
		if (b >= row - 1 && a >= col + 1 && row - 1 >= 0 && col + 1 >= 0) {
			arr[row - 1][col + 1] = symbol;
		}
		// bottom row
		if (b >= row + 1 && a >= col - 1 && row + 1 >= 0 && col - 1 >= 0) {
			arr[row + 1][col - 1] = symbol;
		}
		if (b >= row + 1 && a >= col + 1 && row + 1 >= 0 && col - 1 >= 0) {
			arr[row + 1][col + 1] = symbol;
		}
		if (b >= row + 1 && a >= col && row + 1 >= 0 && col >= 0) {
			arr[row + 1][col] = symbol;
		}
		// Middle row
		if (b >= row && a >= col - 1 && row >= 0 && col - 1 >= 0) {
			arr[row][col - 1] = symbol;
		}
		if (b >= row && a >= col + 1 && row >= 0 && col + 1 >= 0) {
			arr[row][col + 1] = symbol;
		}
		return arr;
	}

	// Vertical win looks for x number of chars until it equals amount, then it
	// reports latest
	public static boolean vWin(char arr[][], char symbol, int amount) {
		// System.out.println("vwin");
		boolean win = false;
		int cco = 0;
		int aco = 0;
		for (int row = 0; row < arr.length; row++) {

			if (arr[row][cco] == symbol) {
				aco++;
			}
			if (aco != amount && row >= arr.length - 1) {
				row = 0;
				cco++;
				aco = 0;

			}
			if (cco == arr.length) {
				System.out.println("Too Far");
				break;
			}

			if (aco == amount) {
				win = true;
				// System.out.println("Row: " + row);
				// System.out.println("column: " + cco);
				break;

			}

		}
		return win;
	}

	// Horizontal win looks for x number of chars until it equals amount, then it
	// reports latest
	public static boolean hWin(char arr[][], char symbol, int amount) {
		// System.out.println("hwin");
		boolean win = false;
		int rco = 0;
		int aco = 0;
		for (int col = 0; col < arr[rco].length; col++) {

			if (arr[rco][col] == symbol) {
				aco++;
			}
			if (aco != amount && col >= arr[rco].length - 1) {
				col = 0;
				rco++;
				aco = 0;

			}
			if (rco == arr.length) {
				System.out.println("Too Far");
				break;
			}

			if (aco == amount) {
				win = true;
				// System.out.println("Row: " + rco);
				// System.out.println("column: " + col);
				break;

			}

		}
		return win;
	}

}
