package fr.mbds.cinema;

import fr.mbds.cinema.entitites.Hall;
import fr.mbds.cinema.entitites.Movie;
import fr.mbds.cinema.entitites.Session;
import fr.mbds.cinema.repositories.HallRepository;
import fr.mbds.cinema.repositories.MovieRepository;
import fr.mbds.cinema.repositories.SessionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CinemaMbds2425LApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaMbds2425LApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(SessionRepository sessionRepository,
                                        MovieRepository movieRepository,
                                        HallRepository hallRepository) {
        return args -> {
            Movie movie = Movie.builder()
                    .name("The Matrix")
                    .synopsis("A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.")
                    .duration("1H30")
                    .releaseDate(new java.util.Date())
                    .posterFileName("matrix.jpg")
                    .build();
            movieRepository.saveAndFlush(movie);

            Hall hall = Hall.builder()
                    .name("Hall 1")
                    .build();
            hallRepository.saveAndFlush(hall);

            Session session = Session.builder()
                    .hall(hall)
                    .movie(movie)
                    .date(new java.util.Date())
                    .build();
            sessionRepository.save(session);
        };
    }

}
