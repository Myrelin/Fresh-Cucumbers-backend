package com.codecool.freshcucumbersbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Component
public class Movie implements Serializable {
    @JsonProperty("Id")
    private String id;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Rating")
    private String rating;

    @JsonProperty("Plot")
    private String plot;
}
