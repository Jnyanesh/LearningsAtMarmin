package com.marmin;

public class Dogs {
    private Dog[] dogs;
    private int count;

    public Dogs(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void add(Dog dog) {
        if (count == dogs.length || dogs.length == 0) {
            IncreaseCapacity();
        }
        dogs[count] = dog;
        count++;
    }

    private void IncreaseCapacity() {
        int newCapacity = dogs.length + 1;
        Dog[] newDogs = new Dog[newCapacity];
        for (int i = 0; i < count; i++) {
            newDogs[i] = dogs[i];
        }
        dogs = newDogs;
    }

    public int size() {
        return dogs.length;
    }

    public Dog get(int index){
        return dogs[index];
    }

    public Dog getLastDog(){
        return dogs[dogs.length-1];
    }


}
