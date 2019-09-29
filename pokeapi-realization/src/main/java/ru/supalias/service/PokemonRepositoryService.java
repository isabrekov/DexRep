package ru.supalias.service;

import ru.supalias.entity.Pokemon;

import java.util.List;

public interface PokemonRepositoryService {
    public List<Pokemon> findAll();
    public Pokemon findOne(Long id);
    public Pokemon saveOne(Pokemon newPokemon);
    public void deleteOne(Long id);
    public void deleteAll();
}
