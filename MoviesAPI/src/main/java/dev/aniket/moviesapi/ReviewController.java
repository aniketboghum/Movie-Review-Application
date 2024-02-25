package dev.aniket.moviesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createView(@RequestBody Map<String, String> payLoad)
    {
        return new ResponseEntity<>(reviewService.createReview(payLoad.get("reviewBody"), payLoad.get("imdbId")), HttpStatus.CREATED);
    }
}
