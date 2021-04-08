/**
 * 
 */
package com.javaoopadv.pokemon;

/**
 * @author ccomstock
 *
 */
public class PokeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("pikachu", 35, "electric");
		System.out.println("created new Pokemon, pikachu");
		Pokedex pokedex = new Pokedex();
		System.out.println("\ncreated new Pokedex");
		pokedex.addPokemon(pikachu);
		System.out.println("\nadded pikachu to pokedex");
		pokedex.createAndAddPokemon("ditto", 48, "normal");
		System.out.println("created and added to pokedex new Pokemon, ditto");
		pokedex.listPokemon();
		Pokemon charmander = new Pokemon("charmander", 39, "fire");
		System.out.println("\ncreated new Pokemon, charmander");
		charmander.attack(pikachu);
		System.out.println("charmander attacked pikachu");
		System.out.println("pikachu's health is now " + pikachu.getHealth());
	}

}
