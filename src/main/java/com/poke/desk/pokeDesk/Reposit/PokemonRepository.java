package com.poke.desk.pokeDesk.Reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poke.desk.pokeDesk.Entity.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Long> {

}
