package ru.supalias.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Ability {
    private String name;
    private AbilitiesEffect abilitiesEffect;
}
