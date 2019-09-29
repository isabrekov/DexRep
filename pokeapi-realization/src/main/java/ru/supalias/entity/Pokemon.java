package ru.supalias.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

@Data
@Document(collection="pokemon")
public class Pokemon  extends ResourceSupport {
    private Long id;
    private String name;
    private List<Ability> abilityList;
}
