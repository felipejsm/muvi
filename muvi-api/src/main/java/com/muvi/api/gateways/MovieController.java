package com.muvi.api.gateways;

import com.muvi.api.usecases.ProduceMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MovieController {
    @Autowired
    private ProduceMovie produceMovie;
    @PostMapping("/movies")
    public void post(@RequestBody String movie) {
        this.produceMovie.send(movie);
    }
}
