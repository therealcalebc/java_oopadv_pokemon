/**
 * 
 */
package com.javaoopadv.pokemon;

/**
 * @author ccomstock
 *
 */
public interface IPokemon {
	
	/**
	 * creates and returns a new Pokemon
	 * @param name the _name for the new Pokemon
	 * @param health the initial _health for the new Pokemon
	 * @param type the _type for the new Pokemon
	 * @return the new Pokemon
	 */
	Pokemon createPokemon(String name, int health, String type);
	
	/**
	 * @param pokemon the Pokemon to stringify the info for
	 * @return the name, health, and type of the Pokemon, stringified
	 */
	String pokemonInfo(Pokemon pokemon);
	
	/**
	 * print to Console all the names of all the Pokemon in your Pokedex
	 */
	void listPokemon();
	
}
