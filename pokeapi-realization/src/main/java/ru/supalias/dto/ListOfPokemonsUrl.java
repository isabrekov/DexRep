package ru.supalias.dto;

import lombok.Data;

import java.net.URL;
import java.util.List;

@Data
public class ListOfPokemonsUrl {
    private int count;
    private URL next;
    private URL previous;
    private List<NameAndUrl> results;
}
