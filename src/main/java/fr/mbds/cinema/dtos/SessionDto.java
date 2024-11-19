package fr.mbds.cinema.dtos;

import fr.mbds.cinema.entitites.Hall;
import fr.mbds.cinema.entitites.Movie;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data @Builder
public class SessionDto {
    private Long id;

    private Movie movie;

    private Hall hall;

    private Date date;
}
