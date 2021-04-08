/**
 * 
 */
package com.javaoopadv.pokemon;

/**
 * @author ccomstock
 *
 */
public abstract class PokeAbs implements IPokemon {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		return String.format("Name: %s, Health: %d, Type: %s", 
				pokemon.getName(), pokemon.getHealth(), pokemon.getType());
	}

}
