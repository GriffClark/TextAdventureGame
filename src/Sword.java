import java.util.Random;
import java.util.Scanner;
public class Sword{
	private Scanner s;
	
	int attackBonus;
	int healthBonus;
	String name;
	
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		s = new Scanner(System.in);
		System.out.println ("What would you like to name your sword?");
		String givenName = s.nextLine();	
		this.name = givenName;
		return givenName;
	}

	public int getHealthBonus() {
		return healthBonus;
	}
	public void setHealthBonus(int healthBonus) {
		this.healthBonus = 0;
	}
	public int getAttackBonus(int attackBonus) { //this pulls attack bonus, assigns it a random number 1-7, and then spits it back out. 
		this.attackBonus = attackBonus;
		attackBonus =((int) Math.random()) * 7;
		return attackBonus;
	}
	
public void getNewSword() {
	this.getAttackBonus(attackBonus); 
	this.setName(name);
	this.setHealthBonus(healthBonus);
	Player.items.add(Sword);
	//how do I add the sword to the items<> of the player??
	
	
}
	
	
	
	

}
//should I make a parent calss holding these methods or should I just copy and paste them?? 