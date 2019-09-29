package ru.supalias.configuration;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.supalias.dto.PokemonDTO;
import ru.supalias.entity.Pokemon;

import java.util.List;

@Mapper
public interface PokemonDTOMapper {
    PokemonDTOMapper INSTANCE = Mappers.getMapper( PokemonDTOMapper.class );
    Pokemon pokemonDTOToPokemon(PokemonDTO pokemonDTO);
    List<Pokemon> pokemonDTOToPokemon(List<PokemonDTO> pokemonDTOList);
}
