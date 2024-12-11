package fr.mbds.cinema.entitites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Setter @Getter @Builder @ToString
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @JsonBackReference : on peut utiliser ça mais c'est moins "précis" que @JsonIgnoreProperties
    @JsonIgnoreProperties("hall")
    @OneToMany(mappedBy = "hall" )
    private List<Session> sessions;
}
