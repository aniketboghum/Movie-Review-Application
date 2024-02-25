package dev.aniket.moviesapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepo;
    public List<Movie> allMovies()
    {
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String id)
    {
        return movieRepo.findMovieByImdbId(id);
    }
}
