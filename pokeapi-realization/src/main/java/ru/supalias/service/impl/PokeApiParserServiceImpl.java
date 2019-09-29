package ru.supalias.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.supalias.configuration.AbilityDTOMapper;
import ru.supalias.configuration.PokemonDTOMapper;
import ru.supalias.dto.*;
import ru.supalias.entity.Pokemon;
import ru.supalias.service.PokeApiParserService;


import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

@Service("PokeApiParserService")
public class PokeApiParserServiceImpl implements PokeApiParserService {
    @Autowired
    ObjectMapper objectMapper;

    public List<Pokemon> parsePokeApi() throws IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon");
        List<Pokemon> pokemonList = new LinkedList<>();
        List<AbilityDTO> abilityDTOList = new LinkedList<>();
        PokemonDTO pokemonDTO;
        //Pokemon pokemon;
        int i = 0;      // счетчик для вложенного foreach, через for все становится еще более громоздким

        ListOfPokemonsUrl listOfPokemonsUrl = objectMapper.readValue(url, ListOfPokemonsUrl.class);
        for (NameAndUrl pokemonResult : listOfPokemonsUrl.getResults()){
            pokemonDTO = objectMapper.readValue(pokemonResult.getUrl(), PokemonDTO.class);
            pokemonList.add(PokemonDTOMapper.INSTANCE.pokemonDTOToPokemon(pokemonDTO));
            for (SomeAbilitiesAttributes someAbilitiesAttributes : pokemonDTO.getAbilities()){
                abilityDTOList.add(objectMapper.readValue(someAbilitiesAttributes.getAbility().getUrl(), AbilityDTO.class));
            }
            pokemonList.get(i).setAbilityList(AbilityDTOMapper.INSTANCE.abilityDTOToAbility(abilityDTOList));
            abilityDTOList.clear();
            i++;
        }
        return pokemonList;
    }
}
