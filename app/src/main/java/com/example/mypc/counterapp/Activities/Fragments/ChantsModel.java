package com.example.mypc.counterapp.Activities.Fragments;

class ChantsModel {
    public String getName() {
        return name;
    }

    public ChantsModel(String name, String user) {
        this.name = name;
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    String name;
    String user;

}
