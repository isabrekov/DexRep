package ru.supalias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class AbilityDTO {
    private String name;
    @JsonProperty("effect_entries")
    private List<AbilitiesEffectDTO> effectEntries;
}
