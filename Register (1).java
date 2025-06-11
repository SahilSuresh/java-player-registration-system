package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Register implements Iterable<Name>{
	
	/**
	 * Register is the store of name, and this has many
	 * feature such as add name, searching name, count 
	 * first name occurrences, and much more. 
	 * @author P2716927
	 */
	
	//fields
	
	private ArrayList<Name> regs; //Collection of name.
	private int roomCapacity; //determining the number of name a register can hold. 
	
	//constructors
	
	/**
	 * Creating a default constructors with roomCapacity of 20.
	 */
	public Register() {
		regs = new ArrayList<>();
		roomCapacity = 20;
	}
	
	/**
	 * Creating Custom Constructors with a empty name and you 
	 * can pass on value to roomCapacity.
	 * 
	 * @param roomCapacity passing on specific value to roomCapacity.
	 */
	public Register(int roomCapacity) {
		regs = new ArrayList<Name>();
		this.roomCapacity = roomCapacity;
	}
	
	//methods
	
	/**
	 * This methods will return the current value of roomCapacity.
	 * 
	 * @return the current value of roomCapacity.
	 */
	public int getRoomCapacity() {
		return roomCapacity;
	}
	
	/**
	 * Adds the given name to the end of the register. 
	 * 
	 * @param n will able to add name. 
	 */
	public void addName(Name n) {
		if (regs.size() < roomCapacity) {    
			regs.add(n);
		}
		
	}
	
	/**
	 * removes the name at index n from the register.
	 * 
	 * @param n The index of the name that the user want to be remove.
	 */
	public Name removeName(int Int) {
		return regs.remove(Int);
	}
	
	/**
	 * methods for checking the size of the Register.
	 * 
	 * @return all the name that is store inside the register. 
	 */
	public int sizeOfRegister() {
		return regs.size();
	}
	
	/**
	 * Methods for clearing name from the register. 
	 */
	public void clearRegister() {
		regs.clear();
	}
	
	/**
	 * Checks if register is empty.
	 *  
	 * @return true or false value depending on whether the register is empty.
	 */
	public boolean isRegisterEmpty() {
		return regs.isEmpty();
				
	}
	
	/**
	 * This methods will return the name at Index i
	 * @param i represent index position for register. So, if the user want
	 * to get a name all they all to do is pass on the index of that regs. 
	 * @return return the name at index i. 
	 */
	public Name getName(int i) {
		Name n = null;
		if(0 <= 1 && i <regs.size()) {
			n = regs.get(i);
		} else {
			n = null;//when i is out of range.
		}
		return n;
		
		
	}
	
	
	/**
	 *Returns a string containing the name in the register.  
	 */
	@Override 
	public String toString() {
		return "Register:[regs=" + regs + ", roomCapacity=" + roomCapacity + "]";
	}
	
	
	/**
	 * This methods will search for name in the register when the user  
	 * has provide initial for it first Names, and then  it will return 
	 * true or false base on that search. 
	 * @param initial of the firstName that you are searching for. 
	 * @return true or false depending on whether the firstName initial 
	 * exist on the register. 
	 */
	
	
	public boolean searchRegisterByFirstNameInitial(char initial) { 
		ArrayList<Character> Char = new ArrayList<>();
		regs.forEach(i -> Char.add(i.getFirstName().charAt(0))); //
		if(Char.contains(initial)){
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Adds the given name on the Array list to the end of the register. 
	 * 
	 * @param n will able to  add name to the end of the register. 
	 */
	public void addNames(ArrayList<Name> n) {
		if (regs.size() + n.size()<= roomCapacity) {
			regs.addAll(n);
		} 
	}
	
	
	
	/**
	 * This methods will count the number of occurrences of first name 
	 * in the register.
	 * @param firstName pass on the FirstName that you want to check the occurrences for. 
	 * @return Integer value of the number of occurrences of first name 
	 * in the register.
	 */
	public int countFirstNameOccurrences(String firstName) {
		int count = 0;
		for (Name i : regs) {
			if (i.getFirstName().equalsIgnoreCase(firstName)) {
				count++;
			}
		}
		return count;
	}
	
	
	/**
	 * This methods will sort the name on the register. 
	 */
	public void sortRegister() {
		
		Collections.sort(regs);
	}
	
	
	/**
	 * This methods will return the Iterator over the elements in this
	 * collections. 
	 * 
	 * @return an Iterator that can uses for iterate over the elements
	 * this collections. 
	 */
	@Override
	public Iterator<Name> iterator() {
		return regs.iterator();
	}
 
	
	
	

	

}
