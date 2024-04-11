package com.example.demo.Actor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    private Long ActorId;
    private String FirstName;
    private String LastName;
    private Date LastUpdate;

    public Actor() {
    }

    public Actor(Long actorId, String firstName, String lastName, Date lastUpdate) {
        ActorId = actorId;
        FirstName = firstName;
        LastName = lastName;
        LastUpdate = lastUpdate;
    }

    public Long getActorId() {
        return ActorId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public void setActorId(Long actorId) {
        ActorId = actorId;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;
    }
}
