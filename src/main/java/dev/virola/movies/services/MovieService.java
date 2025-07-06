package dev.virola.movies.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.virola.movies.Movie;
import dev.virola.movies.repositories.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        // Logic to retrieve all movies
        return movieRepository.findAll(); // Placeholder for actual implementation
    }


    public Optional<Movie> getMovieById( String imdbId) {
        // Logic to retrieve a movie by ID
        return movieRepository.findByImdbId(imdbId); // Placeholder for actual implementation
    }
}
