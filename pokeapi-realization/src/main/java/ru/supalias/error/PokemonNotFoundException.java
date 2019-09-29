package ru.supalias.error;

public class PokemonNotFoundException extends RuntimeException {
    public PokemonNotFoundException(Long id) {
        super("Pokemon id not found : " + id);
    }
}
