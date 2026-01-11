
import java.util.Scanner;

public class Enemy{

	//the Scanner used in this class
	Scanner scan = new Scanner(System.in);

	//the name of the enemy
	private String enemyName;

	/*
	* Creates an enemy object with a name and current 
	* health.
	*
	* @param String enemy 			the name of the enemy
	*/
	public Enemy(String enemy){
		enemyName = enemy;
		currentHealth = 100;
	}

	//the enemy's health points
	private int currentHealth;

	
	public void setCurrentHealth(int damage){
		currentHealth = currentHealth - damage;
		if (currentHealth < 0){
			currentHealth = 0;
		}
	}

	
	public int getCurrentHealth(){
		return currentHealth;
	}

	/*
	* Tells how many health points the enemy has and whether they've 
	* been defeated or not.
	*
	* @return boolean 			returns true if the enemy has been defeated 
	* 							otherwise returns false
	*/
	public boolean healthStatus(){
		System.out.println("The " + enemyName + " now has " + currentHealth 
			+ " health points.");
		if(currentHealth <= 0){
			System.out.println("You've defeated the " + enemyName);
			return true;
		}
		return false;
	}

	/*
	* Plays out a turn in fight for the enemy.
	* 
	* @param Inventory invent 			the player's inventory
	*/
	public void enemyAttack(Inventory invent){
		System.out.println("The " + enemyName + " attacks you!");
		invent.hearts = invent.hearts - (float)(0.25);
		System.out.println("You lose 1/4 of a heart and now have " + invent.hearts + " hearts.");
	}

	/*
	* Plays out a fight for Alice.
	* 
	* @param Inventory invent 			the player's inventory
	* @param Weapons weapon 			the player's weapon
	*
	* @return boolean 					returns true if enemy is defeated
	*/
	public boolean fightMechanics(Inventory invent, Weapons weapon){
		while(healthStatus() == false){
			System.out.println("Press enter to continue fight.");
			if((scan.nextLine()).equals("")){
				enemyAttack(invent);
				weapon.attack(this);
			}
		}
		return true;
	}

	/*
	* Getter method for the enemy name.
	*
	* @return String enemyName 			the enemy's name
	*/
	public String getEnemyName(){
		return enemyName;
	}

}