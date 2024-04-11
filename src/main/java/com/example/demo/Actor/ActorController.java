package com.example.demo.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/actor")
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping(path="/actors")
    public @ResponseBody Iterable<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Actor GetActorById(@PathVariable Long id){
        return actorService.GetActorById(id);
    }

    @PostMapping
    public ResponseEntity<String> createActor(@RequestBody Actor actor){
        actorService.saveActor(actor);
        return new ResponseEntity<String>("Actor was created", HttpStatus.CREATED);
    }
}
