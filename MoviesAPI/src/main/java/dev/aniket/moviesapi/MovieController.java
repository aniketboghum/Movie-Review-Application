package dev.aniket.moviesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies()
    {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdId)
    {
        return new ResponseEntity<>(movieService.singleMovie(imdId), HttpStatus.OK);
    }
}
