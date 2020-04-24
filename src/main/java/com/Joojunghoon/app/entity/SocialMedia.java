package com.Joojunghoon.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SocialMedia {
    @Id
    @GeneratedValue
    private Long id;
    public String github;
    public String twitter;
    public String instagram;
    public String facebook;
    public SocialMedia(){
    }
    public SocialMedia(String github, String twitter, String instagram, String facebook) {
        this.github = github;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }
    public Long getId() {
    return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getgithub(){
        return github;
    }
    public void setgithub(String github){
        this.github = github;
    }
    public String gettwitter() {
        return twitter;
    }
    public void settwitter(String twitter){
        this.twitter = twitter;
    }
    public String getinstagram(){
        return instagram;
    }
    public void setinstagram(String instagram){
        this.instagram = instagram;
    }
    public String getfacebook(){
        return facebook;
    }
    public void setfacebook(String facebook){
        this.facebook = facebook;
    }
}




