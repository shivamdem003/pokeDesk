package com.poke.desk.pokeDesk.Services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poke.desk.pokeDesk.Entity.Pokemon;
import com.poke.desk.pokeDesk.Reposit.PokemonRepository;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonRepository pokeRepo;
	
	@Override
	public Pokemon addPokemon(Pokemon pokemon) {
		return pokeRepo.save(pokemon);
	}

	@Override
	public List<Pokemon> catchAll() {
		return pokeRepo.findAll();
	}

	@Override
	public Pokemon pokemonId(Long iD) {
		return pokeRepo.findById(iD).get();
	}

	@Override
	public String delpokemonId(Long iD) {
		Pokemon e= pokeRepo.findById(iD).get();
		pokeRepo.delete(e);
		return "Deleted Pokemon";
	}

	@Override
	public Pokemon editPokemon(Long iD, Pokemon pokemon) {
		Pokemon e = pokeRepo.findById(iD).get();
		if(Objects.nonNull(pokemon.getName()) && !"".equals(pokemon.getName())) {
			e.setName(pokemon.getName());
		}
		return pokeRepo.save(e);
	}


	
	

}
