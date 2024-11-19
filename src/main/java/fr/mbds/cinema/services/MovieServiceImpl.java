package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.MovieDto;
import fr.mbds.cinema.entitites.Movie;
import fr.mbds.cinema.mappers.MovieMapper;
import fr.mbds.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return MovieMapper.toDtos(movieRepository.findAll());
    }

    @Override
    public MovieDto getMovieById(Long id) {
        return MovieMapper.toDto(movieRepository.findById(id).orElse(null));
    }

    @Override
    public MovieDto saveMovie(Movie movie) {
        return MovieMapper.toDto(movieRepository.save(movie));
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public MovieDto updateMovie(Movie movie) {
        return MovieMapper.toDto(movieRepository.save(movie));
    }
}
