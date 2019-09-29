package ru.supalias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class NameAndUrl {
    private URL url;
    private String name;
}
