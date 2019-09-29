package ru.supalias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class PokemonDTO {
    private Long id;
    private String name;
//    private ListOfAbilitiesUrl abilities;
    private List<SomeAbilitiesAttributes> abilities;
}
