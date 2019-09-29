package ru.supalias.service;

import ru.supalias.entity.Pokemon;

import java.io.IOException;
import java.util.List;

public interface PokeApiParserService {
    public List<Pokemon> parsePokeApi() throws IOException;
}
