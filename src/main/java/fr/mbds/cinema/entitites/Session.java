package fr.mbds.cinema.entitites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JsonManagedReference : on peut utiliser ça mais c'est moins "précis" que @JsonIgnoreProperties
    @JsonIgnoreProperties("sessions")
    @ManyToOne
    private Movie movie;

//    @JsonManagedReference : on peut utiliser ça mais c'est moins "précis" que @JsonIgnoreProperties
    @JsonIgnoreProperties("sessions")
    @ManyToOne
    private Hall hall;

    private Date date;
}
