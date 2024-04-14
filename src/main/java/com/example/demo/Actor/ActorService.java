package com.example.demo.Actor;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public @ResponseBody Iterable<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor GetActorById(Long id){
        return actorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }

    public void saveActor(Actor actor){
        actorRepository.save(actor);
    }

    public void deleteActor(Long id){
        if(actorRepository.existsById(id)){
            actorRepository.deleteById(id);
        }
    }
}
