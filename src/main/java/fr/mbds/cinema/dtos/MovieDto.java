package fr.mbds.cinema.dtos;

import fr.mbds.cinema.entitites.Session;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data @Builder
public class MovieDto {
    private Long visa;

    private String name;

    private String duration;

    private Date releaseDate;

    private String synopsis;

    private String posterFileName;

    private List<Session> sessions;
}
