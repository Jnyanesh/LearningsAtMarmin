package com.marmin;

import java.util.ArrayList;

public class DogDayCare {

    Dogs dogs = new Dogs(0);
    Staffs staffs = new Staffs(0);
    static int MAXIMUM_DAY_CARE_CAPACITY = 5;
    static int AGE_LIMIT = 10;

    public void addDog(Dog dog) {
        if (Validators.IsDogIdDuplicate(dog.getDogId(), dogs)) {
            throw new IllegalArgumentException("Duplicate Dog Id");
        }
        if (!Validators.ValidateDog(dog)) {
            throw new IllegalArgumentException("Invalid Dog details");
        }

        dog.setCheckIn(false);
        dogs.add(dog);
    }

    public Dog getDogbyId(int id) {
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = dogs.get(i);

            if (dog.getDogId() == id) {
                return dog;
            }
        }

        throw new IllegalArgumentException("Id Not found");
    }

    public Dogs getAllDogs() {
        return dogs;
    }

    public void addStaff(Staff staff) {
        if (Validators.IsStaffIdDuplicate(staff.getStaffId(), staffs)) {
            throw new IllegalArgumentException("Duplicate Staff Id");
        }
        if (!Validators.ValidateStaff(staff)) {
            throw new IllegalArgumentException("Invalid Staff details");
        }

        staffs.add(staff);
    }

    private void checkInDog(Dog d) {
        if (!Validators.IsDogRegistered(d.getDogId(), dogs)) {
            throw new IllegalArgumentException("Dog Id not registered");
        }

        if (d.getCheckIn()) {
            throw new IllegalArgumentException("Dog already checked in");
        }

        d.setCheckIn(true);

    }

    public void checkOutDog(Dog d) {
        if (!Validators.IsDogRegistered(d.getDogId(), dogs)) {
            throw new IllegalArgumentException("Dog Id not registered");
        }

        if (!d.getCheckIn()) {
            throw new IllegalArgumentException("Dog already checked out");
        }

        d.setCheckIn(false);

    }

    public Dogs listCheckedInDogs() {
        Dogs result = new Dogs(0);

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getCheckIn()) {
                result.add(dogs.get(i));
            }
        }

        return result;
    }

    public void requestCheckIn(Dog d) {
        if (d.getAge() <= AGE_LIMIT) {
            if (listCheckedInDogs().size() < MAXIMUM_DAY_CARE_CAPACITY) {
                checkInDog(d);
            } else {
                throw new IllegalArgumentException("Day care capacity reached");
            }

        } else {
            throw new IllegalArgumentException("Dog not eligible for Checkin");
        }

    }

    public String getSummary(){
        return "DOGS REGISTERED: "+getAllDogs().size()+" DOGS CHECKED IN: "+listCheckedInDogs().size()+" AVAILABLE SPACE: "+ (MAXIMUM_DAY_CARE_CAPACITY - listCheckedInDogs().size());
    }

    

}
