package com.stackroute.demo.Demo;

public class movie  {

 private actor actor = new actor();

    public movie(com.stackroute.demo.Demo.actor actor) {
        this.actor = actor;
    }

    public com.stackroute.demo.Demo.actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.demo.Demo.actor actor) {
        this.actor = actor;
    }
}
