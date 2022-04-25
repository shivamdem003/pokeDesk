package com.poke.desk.pokeDesk.Services;

import java.util.List;

import com.poke.desk.pokeDesk.Entity.Pokemon;

public interface PokemonService {

	Pokemon addPokemon(Pokemon pokemon);

	List<Pokemon> catchAll();

	Pokemon pokemonId(Long iD);

	String delpokemonId(Long iD);

	Pokemon editPokemon(Long iD, Pokemon pokemon);


}
