
public class Bear {
	private int attack = 6;
	public int health = 40;
	public static boolean isAlive = true;
	public int totalAttack () {
		int a;
		a= attack + ((int)Math.random() * 3);
		return a;
	}
	
	public void setHealth (int health) {
		this.health = health;
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	public int getHealth() {
		return health;
	}
	
	

}
