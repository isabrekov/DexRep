package ru.supalias.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.supalias.entity.Pokemon;

public interface PokemonRepository extends MongoRepository<Pokemon, Long> {
}
