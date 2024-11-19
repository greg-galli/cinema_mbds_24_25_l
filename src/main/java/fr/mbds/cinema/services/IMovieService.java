package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.MovieDto;
import fr.mbds.cinema.entitites.Movie;

import java.util.List;

public interface IMovieService {
    public List<MovieDto> getAllMovies();
    public MovieDto getMovieById(Long id);
    public MovieDto saveMovie(Movie movie);
    public void deleteMovie(Long id);
    public MovieDto updateMovie(Movie movie);
}
