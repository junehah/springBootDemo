package com.example.demo.Actor;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ActorId;
    private String FirstName;
    private String LastName;
    private Date LastUpdate;

    public Actor(String firstName, String lastName, Date lastUpdate) {
        FirstName = firstName;
        LastName = lastName;
        LastUpdate = lastUpdate;
    }

    public Actor(){}

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
