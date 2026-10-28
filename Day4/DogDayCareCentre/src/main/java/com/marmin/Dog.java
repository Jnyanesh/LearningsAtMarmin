package com.marmin;

public class Dog {
    private final int dogId;
    private String dogName;
    private String breed;
    private int age;
    private String ownerName;
    private boolean checkIn;

    public Dog(int dogId, String dogName, String breed, int age, String ownerName) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.breed = breed;
        this.age = age;
        this.ownerName = ownerName;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean getCheckIn() {
        return checkIn;
    }
    
    public void setCheckIn(boolean checkIn ){
        this.checkIn = checkIn;

    }

}

