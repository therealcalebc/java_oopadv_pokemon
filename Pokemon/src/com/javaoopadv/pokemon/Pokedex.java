/**
 * 
 */
package com.javaoopadv.pokemon;

import java.util.ArrayList;

/**
 * @author ccomstock
 *
 */
public class Pokedex extends PokeAbs {
	
	protected ArrayList<Pokemon> myPokemons;
	
	public Pokedex() {
		myPokemons = new ArrayList<Pokemon>();
	}

	@Override
	public void listPokemon() {
		System.out.println("\n~Pokemon currently in Pokedex List~");
		for(Pokemon pokemon : myPokemons) {
			System.out.println(pokemonInfo(pokemon));
		}
	}
	
	/**
	 * @param pokemon the Pokemon to add to the List of my Pokemon
	 */
	public void addPokemon(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}
	
	/**
	 * creates a new Pokemon and adds it to the List of my Pokemon
	 * @param name the _name for the new Pokemon
	 * @param health the initial _health for the new Pokemon
	 * @param type the _type for the new Pokemon
	 */
	public void createAndAddPokemon(String name, int health, String type) {
		myPokemons.add(createPokemon(name, health, type));
	}

}
