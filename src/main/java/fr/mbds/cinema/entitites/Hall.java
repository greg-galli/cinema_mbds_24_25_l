package fr.mbds.cinema.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Setter @Getter @Builder @ToString
public class Hall {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "hall" )
    private List<Session> sessions;
}
