/**
 * 
 */
package com.javaoopadv.pokemon;

/**
 * @author ccomstock
 *
 */
public class Pokemon {
	
	protected String _name;
	protected int _health;
	protected String _type;
	private static int _count = 0;
	
	public Pokemon(String name, int health, String type ) {
		_name = name;
		_health = health;
		_type = type;
		_count++;
	}
	
	/**
	 * @return the _name
	 */
	public String getName() {
		return _name;
	}
	
	/**
	 * @param name the _name to set
	 */
	public void setName(String name) {
		_name = name;
	}
	
	/**
	 * @return the _health
	 */
	public int getHealth() {
		return _health;
	}
	
	/**
	 * @param amount how much to decrease _health
	 */
	public void decreaseHealth(int amount) {
		if(amount > _health)
			_health = 0;
		else
			_health -= amount;
	}
	
	/**
	 * @return the _type
	 */
	public String getType() {
		return _type;
	}
	
	/**
	 * @param poke the Pokemon to attack
	 */
	public void attack(Pokemon poke) {
		poke.decreaseHealth(10);
	}
	
}
