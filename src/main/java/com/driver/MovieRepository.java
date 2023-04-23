package com.driver;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Repository
public class MovieRepository {

    public HashMap<String,Movie> movieDb = new HashMap<>();

    public HashMap<String,Director> directorDb = new HashMap<>();
    public String addMovie(@RequestBody Movie movie){
        movieDb.put(movie.getName(),movie);
        return "SUCCESS";
    }
    public String addDirector(@RequestBody Director director) {
        directorDb.put(director.getName(),director);
        return "SUCCESS";
    }

    public String getMovieByName(@PathVariable("name") Movie name){
        movieDb.get();
        return "SUCCESS";
    }
}
