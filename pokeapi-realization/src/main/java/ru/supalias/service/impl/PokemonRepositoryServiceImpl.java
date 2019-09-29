package ru.supalias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.supalias.entity.Pokemon;
import ru.supalias.error.PokemonNotFoundException;
import ru.supalias.repository.PokemonRepository;
import ru.supalias.service.PokemonRepositoryService;

import java.io.IOException;
import java.util.List;

@Service("PokemonRepositoryService")
public class PokemonRepositoryServiceImpl implements PokemonRepositoryService {
    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    public Pokemon findOne(Long id) {
        return pokemonRepository.findById(id)
                .orElseThrow(() -> new PokemonNotFoundException(id));
    }

    public Pokemon saveOne(Pokemon newPokemon) {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(newPokemon.getId());
        pokemon.setName(newPokemon.getName());
        pokemon.setAbilityList(newPokemon.getAbilityList());
        return pokemonRepository.save(pokemon);
    }

    public void deleteOne(Long id) {
        pokemonRepository.deleteById(id);
    }

    public void deleteAll() {
        pokemonRepository.deleteAll();
    }
}
