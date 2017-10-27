import java.util.Scanner;
import java.util.Random;
public class Game {
	
/* how do I make it so that the choices you make in the game class affect what subclasses apply to your player class. What if you choose to be human? How do I make only human apply to the player class?
 * should I integrate a turn counter to ensure someone can't just type in something to jump ahead in the game?
	*/
	
	/*
	 * Structure looks like this:
	 * While (isAlive == true){
	 * get user input
	 * do things based on user input
	 * show things to the user
	 * }
	 */
	//it was throwing up errors when I didn't have the static. But I want this to be able to change, right? So why do I have to have it static?
	public static void main (String[] args) { 		
		Scanner keyboard = new Scanner (System.in); 
		Player player = new Player(); 
		Sword sword = new Sword();
		
		String userInput = keyboard.next();
	
		//intro
		System.out.println("Welcome to my tiny adventure game!. After you are faced with a choice, please input your response. Good luck!\nIf you need help, simply type 'help'");
		System.out.println("type 'start' if you would like to begin");
		
		
		while (true){
			
			if (userInput.equals ("help")) {
				System.out.println("'display stats' or 'restart'");
			}	
			
			else if (userInput.equals("display stats")) {
				player.displayStats();
			}
		
			else if (userInput.equals ("start") || userInput.equals("restart")) { 
				System.out.println("Welcome, player. You will spend your next few moments determining how you will approach this adventure. \nFirst, you will need to pick your race. ");
				System.out.println("Are you a 'human', 'elf', or 'dwarf' ? ");			
			}//ends start screen
		 
			
			else if (userInput.equals ("human")) {
				System.out.println("you have chosen to be a humun. \n If you wouold like to choose another class, type 'restart. Else, type 'continue'");
				player.setHumanStats();	
			} // ends human
		
			else if (userInput.equals ("dwarf")) {
				System.out.println("you have chosen to be a dwarf. \n If you wouold like to choose another class, type 'restart. Else, type 'continue'");
				player.setDwarfStats();
		 } // ends dwarf
		
			else if (userInput.equals ("elf")) {
			
				System.out.println("you have chosen to be an elf. \n If you wouold like to choose another class, type 'restart. Else, type 'continue'");
				player.setElfStats();
		} // ends elf

			
			
		
		if (userInput.equals ("continue")) {
			
			
			System.out.println("You have been contracted by Bluestar Exploration Company to travel west and explore rumors of a dragon living in the mountrains.  \n There are two ways west, by 'sea' or by 'land'");
			userInput = keyboard.next();
			
		}//ends continue
		
		 if (player.hasRace()== false) {
				Scanner type = new Scanner (System.in);
				System.out.println("Error. You're raceless. Please 'restart'");
				
				String y = type.nextLine();
				//debug if you type restart after the class selection screen you are asked to type it again. Then it works. 
				
			}//end noRace error message
		
		if (userInput.equals ("sea")) {
			System.out.println("You are booked a ticket on a merchant's ship heading west. After two long days of sailing, you come across a small island. Do you want to ask the ship to 'stop' or 'keep going'?");
			userInput = keyboard.next();
		} // ends sea
		
		if (userInput.equals ("land")) {
			System.out.println("you are put in touch wiht a caravan transporting grain to the west. Do you want to travel with the 'caravan' or 'alone'?");
			userInput = keyboard.next();
		}//ends land
		
		if (userInput.equals  ("keep going")) {
			System.out.println ("Your ship keeps going. As the sun begins to set, you see a ship with black sails not that far away. The captian tells the men to find weapons and arm themselves.");
			System.out.  println("You are given a sword!");
			sword.getNewSword();
			System.out.println("However, the first mate tells the captian that you should go around it and try to run. The captian turns to you. Do you tell him to 'fight' or 'flee'");
			userInput = keyboard.next();
		}//ends keep going
		
		if (userInput.equals ("stop")) { // can I make it so that there is a chance that it takes you to a different part of the tree where the ship does not stop?
			System.out.println("The ship drops anchor. You and some men are sent onto the island to look for supplies and valuables.");
			System.out.println("You are given a sword!");
			System.out.println("You beach your little boat and begin to explore the island. Suddenly, you hear a roar from farther up the island. Do you tell your men to 'return to ship' or 'ignore it' or 'go towards it'?");
			userInput = keyboard.next();
			
		}//ends stop
		
		if (userInput.equals ("ignore it")) {
			System.out.println("You continue onwards when suddenly a giant bear leaps out of the brush at you. lt mauls one of the men with you to death. The rest of your men run. Do you 'run with them' or 'fight the bear'");
		}//ends ignore it 
		
//		if (s.equals("fight the bear")) {
//			Bear enemyBear = new Bear (40,4);
			//now how do I do some combat so you and the bear are fighting? Can i make it so that, turn by turn with the player going first, you display what is going on in combat and only have this move on after combat?
			/*
			 * So to make a combat do I create a new combat class that has a method that compairs two fighters against each other, or do I do that in the game class?
			 */
		}
		
		}
		/*
		 * change to else-if with else statement invalad command
		 */
		
	}
//		System.out.println("You have died. Sorry. That sucks. Better luck next time.");
		// now how do I give you an option to loop back to the start?
	

// how do I make it so that players can't just skip ahead if they have played the game before, or re-make decisions? In other words, how do I make it so that the game can only move forwards?
// how would i make it so the player could check their health attack and items by typing 'check health' 'check attack' or 'check items'? By writing a method that can be accessed at any time 
//Each time a decision effects health or attack or something, write a method that goes into the player class and changes it. 