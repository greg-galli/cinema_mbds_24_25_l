package fr.mbds.cinema.mappers;

import fr.mbds.cinema.dtos.MovieDto;
import fr.mbds.cinema.entitites.Movie;

import java.util.List;

public class MovieMapper {

    public static MovieDto toDto(Movie movie) {
        return MovieDto.builder()
                .visa(movie.getVisa())
                .name(movie.getName())
                .duration(movie.getDuration())
                .releaseDate(movie.getReleaseDate())
                .synopsis(movie.getSynopsis())
                .posterFileName(movie.getPosterFileName())
                .sessions(movie.getSessions())
                .build();
    }

    public static Movie toEntity(MovieDto movieDto) {
        return Movie.builder()
                .visa(movieDto.getVisa())
                .name(movieDto.getName())
                .duration(movieDto.getDuration())
                .releaseDate(movieDto.getReleaseDate())
                .synopsis(movieDto.getSynopsis())
                .posterFileName(movieDto.getPosterFileName())
                .sessions(movieDto.getSessions())
                .build();
    }

    public static List<MovieDto> toDtos(List<Movie> movies) {
        return movies.stream().map(MovieMapper::toDto).toList();
    }

    public static List<Movie> toEntities(List<MovieDto> movieDtos) {
        return movieDtos.stream().map(MovieMapper::toEntity).toList();
    }

}
