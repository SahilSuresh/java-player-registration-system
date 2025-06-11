package lib;

/**
 * Player has name, Pair of dice and String to the gamerTag. this is example
 * that shows the Player is a Composition of Name and PairOfDice.
 * 
 * @author P2716927
 */
public class Player implements Rollable, Comparable<Player> {

	// fields
	private Name name;
	private Rollable dices;
	private String gamerTag;

	// constructors
	/**
	 * Default constructor to create a new player with default name, default dices
	 * and with default gamerTag.
	 */
	public Player() {
		name = new Name();
		dices = new PairOfDice();
		gamerTag = "";
	}

	/**
	 * Custom Constructor that assign values to each fields.
	 * 
	 * @param name     the name of player.
	 * @param gamerTag the gamerTag of the player.
	 */
	public Player(Name name, String gamerTag) {
		this.name = name;
		this.dices = new PairOfDice();
		this.gamerTag = gamerTag;
	}

	/**
	 * Custom Constructor that assign values to each fields.
	 * 
	 * @param name     the name of player.
	 * @param dices    the pair of dice of the player.
	 * @param gamerTag the gamerTage of the player.
	 */
	public Player(Name name, String gamerTag, Rollable dices) {
		this.name = name;
		this.dices = dices;
		this.gamerTag = gamerTag;
	}

	// methods
	/**
	 * This methods will return the current value of name.
	 * 
	 * @return return the current value of name.
	 */
	public Name getName() {
		return name;
	}

	/**
	 * This methods will able to pass on values to name.
	 * 
	 * @param name this will able to pass on values to name.
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * This methods will able to return the current value for the dices.
	 * 
	 * @return returns the current value of dices.
	 */
	public Rollable getRollable() {
		return dices;
	}

	/**
	 * This methods will able to roll the the dices with the help of roll methods
	 * from PairOfDice.
	 */
	public void rollDice() {
		this.dices.roll();

	}

	public int getScore() {
		return this.dices.getScore();

	}

	/**
	 * This methods will able to return dices score with the help of getDiceScore
	 * methods from PairOfDice.
	 * 
	 * @return returns dices score.
	 */
	public int getDiceScore() {
		return this.dices.getScore();
	}

	/**
	 * This methods will able to pass on values to gamerTag.
	 * 
	 * @param gamerTag will able to pass on values to gamerTag.
	 */
	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}

	/**
	 * This methods will able to return the current value of gamerTag
	 * 
	 * @return will able to return the current value of gameTag
	 */
	public String getGamerTag() {
		return gamerTag;
	}

	/**
	 * The methods will able to print out the entire Player details into a single
	 * output.
	 * 
	 * @return this will return the current value for name, dices, and gamerTag.
	 */
	@Override
	public String toString() {
		return "Player:[name=" + name + ", dices=" + dices + ", gamerTag=" + gamerTag + "]";
	}

	/**
	 * This methods will able to return the current value for the dices.
	 * 
	 * @return returns the current value of dices.
	 */
	@Override
	public void roll() {
		this.dices.roll();

	}

	/**
	 * This methods will compares this Player object with another Player object 
	 * for ordering base base on their name and gamerTags.
	 * 
	 * @param other The player object to compare with this Player.
	 * @return A negative, integer, zero, or a positive integer as this Player is
	 *         less than, equal to, or greater than the specified Player(Other).
	 */

	@Override
	public int compareTo(Player other) {

		int result = this.name.compareTo(other.name);

		if (result == 0) {
			result = this.gamerTag.compareTo(other.gamerTag);
		}
		return result;
	}

	
	/**
	 * This methods will extract the first and the family names, then it will extract
	 * the first letter from first name and converted to upperCase, and rest of the name 
	 * to lowerCase. Then it will extract the first letter from family and converted it 
	 * to upperCase, and the rest to lowerCase.
	 * 
	 * @param name This will extract the first and family names from Player name.
	 */
	// TIM JONES
	public void setFullPlayerName(String name) {
		int space = name.indexOf(" ");

		String firstName = name.substring(0, space);
		String firstName1 = firstName.substring(0, 1).toUpperCase();
		String firstName2 = firstName.substring(1, space).toLowerCase();
		String firstName3 = firstName1 + firstName2;

		String secondName = name.substring(space);
		String secondName1 = secondName.substring(1, 2).toUpperCase();
		String secondName2 = secondName.substring(2).toLowerCase();
		String secondName3 = secondName1 + secondName2;
		
		this.name= new Name(firstName3, secondName3);
	}
	
	
	/**
	 * This methods will gemerTag base on fullName and a given number by the user. 
	 * first this methods will ensure that gamerTag is between 1 to . It will reversed 
	 * the fullName, convert it to lowerCase and remove whitespace between first and familyName
	 * Then it will generate gamerTag.
	 * 
	 * @param gamerTag the number to be appended to the gamerTag. The gamerTag must be between 1 to 100.
	 */
	public void generateGamerTag(int gamerTag) {
		
		if(gamerTag >= 1 && gamerTag <= 100) {
			
			String fullName = name.getFirstName() + name.getFamilyName();
			String reverseFullName = new StringBuffer(fullName).reverse().toString().toLowerCase();
			
			this.gamerTag = reverseFullName + gamerTag; 
			}
		}
}