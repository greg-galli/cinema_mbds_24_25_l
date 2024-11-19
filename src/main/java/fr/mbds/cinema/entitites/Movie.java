package fr.mbds.cinema.entitites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visa;

    private String name;

    private String duration;

    private Date releaseDate;

    private String synopsis;

    private String posterFileName;

    @OneToMany(mappedBy = "movie" )
    private List<Session> sessions;
}
