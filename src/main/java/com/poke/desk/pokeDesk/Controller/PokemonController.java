package com.poke.desk.pokeDesk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poke.desk.pokeDesk.Entity.Pokemon;
import com.poke.desk.pokeDesk.Services.PokemonService;


@RestController
@CrossOrigin(origins = "*")
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/home")
	public String show() {
		return "<h1>Welcome to a world of Pokemons..<h1>";
	}
	
	@PostMapping("/pokemon")
	public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
		System.out.println("Pokemon Added");
		return pokemonService.addPokemon(pokemon);
	}
	
	@GetMapping("/pokemon")
	public List<Pokemon> catchAll(){
		return pokemonService.catchAll();
		
	}
	
	@GetMapping("/pokemon/{id}")
	public Pokemon pokemonId(@PathVariable("id") Long ID) {
		return pokemonService.pokemonId(ID);
		
	}
	@DeleteMapping("/pokemon/{id}")
	public String delPokemonId(@PathVariable("id") Long ID) {
		return pokemonService.delpokemonId(ID);
	}
	
	@PutMapping("/pokemon/{id}")
	public Pokemon editPokemon(@PathVariable("id") Long ID ,@RequestBody Pokemon pokemon) {
		return pokemonService.editPokemon(ID,pokemon);
	}
	
}
