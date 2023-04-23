package com.driver;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
    MovieRepository movieRepository = new MovieRepository();

    public String addMovie(Movie movie){
        return movieRepository.addMovie(movie);
    }

    public String addDirector(Director director){
        return movieRepository.addDirector(director);
    }
    public String getMovieByName(Movie movie){
        return movieRepository.getMovieByName();
    }
}
