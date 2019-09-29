package ru.supalias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.supalias.entity.Pokemon;
import ru.supalias.service.PokeApiParserService;
import ru.supalias.service.PokemonRepositoryService;

import java.io.IOException;
import java.util.List;

@RestController
public class MainPageController {
    @Autowired
    PokeApiParserService pokeApiParserService;
    @Autowired
    PokemonRepositoryService pokemonRepositoryService;

    @GetMapping("/pokemons/")
    public List<Pokemon> findAll() {
        return pokemonRepositoryService.findAll();
    }

    @GetMapping("/pokemons/{id}")
    public Pokemon findOne(@PathVariable Long id) {
        return pokemonRepositoryService.findOne(id);
    }

    @PutMapping("/pokemons/")
    public Pokemon saveOne(@RequestBody Pokemon newPokemon) {
        return pokemonRepositoryService.saveOne(newPokemon);
    }

    @DeleteMapping("/pokrmons/{id}")
    public void deleteOne(@PathVariable Long id) {
        pokemonRepositoryService.deleteOne(id);
    }

    @DeleteMapping("/pokemons/")
    public void deleteAll() {
        pokemonRepositoryService.deleteAll();
    }

    @GetMapping("/pokemons/")
    public List<Pokemon> parsePokemons() throws IOException {
        return pokeApiParserService.parsePokeApi();
    }
}
