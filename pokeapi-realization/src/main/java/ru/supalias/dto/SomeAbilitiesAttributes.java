package ru.supalias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class SomeAbilitiesAttributes {  //я не придумал нормальное название для этого класса, тк выкинул из него поля slot и isHidden, и класс стал очень странным
    private NameAndUrl ability;
}
