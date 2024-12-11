package fr.mbds.cinema.entitites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
//@JsonIgnoreProperties(value = { "movie" ,"hibernateLazyInitializer", "handler" }, allowSetters = true)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visa;

    private String name;

    private String duration;

    private Date releaseDate;

    private String synopsis;

    private String posterFileName;

//    @JsonBackReference : on peut utiliser ça mais c'est moins "précis" que @JsonIgnoreProperties
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") : on peut utiliser ça mais c'est moins "précis" que @JsonIgnoreProperties
    @JsonIgnoreProperties("movie")
    @OneToMany(mappedBy = "movie")
    private List<Session> sessions;
}
