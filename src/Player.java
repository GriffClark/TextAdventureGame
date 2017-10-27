import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	 
	private ArrayList<Item> items = new ArrayList<Item>();
	private int h;
	private int baseA;
	private String race;
	private int gold = 0;
	public boolean isAlive = true;
	private boolean hasRace = false;
	private int totalDamage;
	
	public boolean isAlive(){ //checks if the player is still alive. Will be called whenever there is combat
		boolean alive = true;
		if (h >0) {
			alive = true;
		}
		else if (h <= 0) {
			alive = false;
		}
		return alive;
	}
	
	public String displayStats() {
		
		return "Your stats are as follows:\nYour current health ~ " + h +"\nYour current attack ~ " + totalDamage() + "\nYour are a ~ " + race + 
				"\nYou current have ~ " +gold + " gold";
	}

		

		
	public int totalDamage() { // returns the total damage a player can do
		int total = this.baseA;
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getAttackBonus(); //calls the getAttackBonus() for each item 
		}
		
		this.totalDamage = total;
		return total;
		//this sets the total damage by starting with base a and adding the bonus of each item
	}
	
	public boolean missChance() {
		boolean missed = false;
		double miss = Math.random();
		if (miss < .1) {
		missed = true;
			//gives you a 1/10 chance to miss with every attack
	}		
		return missed;
	}
	
	
	public int currentHP() {
		return h;
	}
	public boolean hasRace() {
		return hasRace;
	}

	public void setElfStats() {
		// TODO Auto-generated method stub
		this.hasRace = true;
		this.h = 20;
		this.baseA = 20;
		this.gold= 3;
		this.race = "Elf";
		System.out.println(race + " successfully generated!");
		
	}
	
	public void setHumanStats() {
		
	this.hasRace = true;
	this.h = 15;
	this.baseA = 22;
	this.gold= 7;
	this.race = "Human";
	System.out.println(race +" successfully generated!");

	}
	
	public void setDwarfStats() {
		
	this.hasRace = true;
	this.h = 30;
	this.baseA = 12;
	this.gold= 13;
	this.race = "Dwarf";
	System.out.println(race +" successfully generated!");
	
	}
}


// how do I build a window that will display all status of the player? 
// just in general how to I make combat happen within my code?