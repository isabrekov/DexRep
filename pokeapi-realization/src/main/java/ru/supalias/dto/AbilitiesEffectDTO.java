package ru.supalias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class AbilitiesEffectDTO {
    private String effect;
    @JsonProperty("short_effect")
    private String shortEffect;
}
