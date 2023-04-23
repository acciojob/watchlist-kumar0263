package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    MovieService movieService = new MovieService();

    @PostMapping("/add_Movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        String message = "Movie added Successfully";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        String  message = "Directory added Successfully";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

    @GetMapping("/get-movie-by-name/{name}")
    public Object getMovieByName(@PathVariable("name") Movie name){
        String movie = movieService.getMovieByName(name);
        if(movie != null){
            return ResponseEntity.ok(movie);
        }
        return ResponseEntity.notFound().build();
    }
}
