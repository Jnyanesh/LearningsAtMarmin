package com.marmin;

import com.marmin.Dog;
import com.marmin.DogDayCare;
import com.marmin.Staff;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestDogDayCare {
    @Test
    void TestIntializeDog() {
        DogDayCare dogdaycare = new DogDayCare();

        Assertions.assertTrue(dogdaycare.dogs.size() == 0);

    }

    @Test
    void TestInvalidDogDetails() throws IllegalArgumentException {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog dog2 = new Dog(102, "", "", -3, "");
            dogdaycare.addDog(dog2);
        }

        catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Invalid Dog details");

        }

    }

    @Test
    void TestValidDogDetails() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(102, "Doggy", "Labrador", 7, "Radha");
        dogdaycare.addDog(dog1);

        Assertions.assertEquals(1, dogdaycare.dogs.size());

    }

    @Test
    void TestFindById() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(102, "Doggy", "Labrador", 7, "Radha");
        dogdaycare.addDog(dog1);

        Dogs expected = new Dogs(0);
        expected.add(dog1);
        Dog actual = dogdaycare.getDogbyId(102);

        Assertions.assertEquals(dog1, actual);

    }

    @Test
    void TestDuplicateDogId() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog dog1 = new Dog(102, "Rock", "Pug", 2, "Yashodha");
            Dog dog2 = new Dog(102, "Doggy", "Labrador", 7, "Radha");
            dogdaycare.addDog(dog1);
            dogdaycare.addDog(dog2);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Duplicate Dog Id", e.getMessage());
        }
    }

    @Test
    void TestListAllDogs() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        Dog dog2 = new Dog(102, "Bruno", "Shitzu", 3, "Balram");
        Dog dog3 = new Dog(103, "Doggy", "Labrador", 7, "Radha");
        dogdaycare.dogs.add(dog1);
        dogdaycare.dogs.add(dog2);
        dogdaycare.dogs.add(dog3);

        Dogs actual = new Dogs(0);
        actual.add(dog1);
        actual.add(dog2);
        actual.add(dog3);

        Assertions.assertEquals(3, actual.size());
        Assertions.assertEquals(101, actual.get(0).getDogId());
        Assertions.assertEquals(102, actual.get(1).getDogId());
        Assertions.assertEquals(103, actual.get(2).getDogId());
    }

    @Test
    void TestIntializeStaff() {
        DogDayCare dogdaycare = new DogDayCare();

        Assertions.assertTrue(dogdaycare.staffs.size() == 0);

    }

    @Test
    void TestValidStaffDetails() {
        DogDayCare dogdaycare = new DogDayCare();

        Staff s = new Staff(1, "Heidi");
        dogdaycare.addStaff(s);

        Assertions.assertEquals(dogdaycare.staffs.size(), 1);
        Assertions.assertEquals(dogdaycare.staffs.get(0).getStaffId(), 1);
    }

    @Test
    void TestInvalidStaffDetails() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Staff s = new Staff(-1, "Heidi");
            dogdaycare.addStaff(s);
        }

        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid Staff details", e.getMessage());
        }
    }

    @Test
    void TestDuplicateStaffId() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Staff staff1 = new Staff(1, "Raju");
            Staff staff2 = new Staff(1, "Raaju");
            dogdaycare.addStaff(staff1);
            dogdaycare.addStaff(staff2);
        }

        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Duplicate Staff Id", e.getMessage());

        }

    }

    @Test
    void TestValidDogCheckIn() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        dogdaycare.addDog(dog1);
        dogdaycare.requestCheckIn(dog1);

        Assertions.assertTrue(dog1.getCheckIn());

    }

    @Test
    void TestValidDogCheckOut() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        dogdaycare.addDog(dog1);
        dogdaycare.requestCheckIn(dog1);
        dogdaycare.checkOutDog(dog1);

        Assertions.assertFalse(dog1.getCheckIn());

    }

    @Test
    void TestAlreadyCheckedInDog() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
            dogdaycare.addDog(dog1);
            dogdaycare.requestCheckIn(dog1);
            dogdaycare.requestCheckIn(dog1);
        }

        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Dog already checked in", e.getMessage());
        }

    }

    @Test
    void TestAlreadyCheckedOutDog() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog d1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
            dogdaycare.addDog(d1);
            dogdaycare.requestCheckIn(d1);
            dogdaycare.checkOutDog(d1);
            dogdaycare.checkOutDog(d1);
        }

        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Dog already checked out", e.getMessage());
        }

    }

    @Test
    void TestListCheckedInDogs() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        Dog dog2 = new Dog(102, "Bruno", "Shitzu", 3, "Balram");
        Dog dog3 = new Dog(103, "Doggy", "Labrador", 7, "Radha");
        dogdaycare.addDog(dog1);
        dogdaycare.addDog(dog2);
        dogdaycare.addDog(dog3);
        dogdaycare.requestCheckIn(dog2);
        dogdaycare.requestCheckIn(dog3);

        Dogs dogs = new Dogs(0);
        dogs.add(dog2);
        dogs.add(dog3);

        Dogs actual = dogdaycare.listCheckedInDogs();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals(102, actual.get(0).getDogId());
        Assertions.assertEquals(103, actual.get(1).getDogId());

    }

    @Test
    void TestEligibilityCaseAgainstCapacity() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
            Dog dog2 = new Dog(102, "Bruno", "Shih-tzu", 3, "Balram");
            Dog dog3 = new Dog(103, "Doggy", "Labrador", 7, "Radha");
            Dog dog4 = new Dog(104, "Sandy", "Pomorian", 5, "Yashodha");
            Dog dog5 = new Dog(105, "Pinky", "Golden Retriever", 10, "Nanda");
            Dog dog6 = new Dog(106, "Monkey", "Beagle", 10, "Kamsa");

            dogdaycare.addDog(dog1);
            dogdaycare.addDog(dog2);
            dogdaycare.addDog(dog3);
            dogdaycare.addDog(dog4);
            dogdaycare.addDog(dog5);
            dogdaycare.addDog(dog6);

            dogdaycare.requestCheckIn(dog1);
            dogdaycare.requestCheckIn(dog2);
            dogdaycare.requestCheckIn(dog3);
            dogdaycare.requestCheckIn(dog4);
            dogdaycare.requestCheckIn(dog5);
            dogdaycare.requestCheckIn(dog6);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Day care capacity reached");
        }

    }

    @Test
    void TestNonEligibleDog() {
        DogDayCare dogdaycare = new DogDayCare();

        try {
            Dog dog1 = new Dog(101, "Puppy", "Bulldog", 12, "Krishna");
            dogdaycare.addDog(dog1);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Dog not eligible for Checkin");
        }
    }

    @Test 
    void TestInitialSummary(){
        DogDayCare dogdaycare = new DogDayCare();

        String actual = "DOGS REGISTERED: " + 0+ " DOGS CHECKED IN: " + 0 + " AVAILABLE SPACE: " + 5;
        String expected = dogdaycare.getSummary();
        
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void TestSummary() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        Dog dog2 = new Dog(102, "Bruno", "Shih-tzu", 3, "Balram");
        Dog dog3 = new Dog(103, "Doggy", "Labrador", 7, "Radha");
        Dog dog4 = new Dog(104, "Sandy", "Pomorian", 5, "Yashodha");
        Dog dog5 = new Dog(105, "Pinky", "Golden Retriever", 10, "Nanda");
        Dog dog6 = new Dog(106, "Monkey", "Beagle", 10, "Kamsa");

        dogdaycare.addDog(dog1);
        dogdaycare.addDog(dog2);
        dogdaycare.addDog(dog3);
        dogdaycare.addDog(dog4);
        dogdaycare.addDog(dog5);
        dogdaycare.addDog(dog6);

        dogdaycare.requestCheckIn(dog1);
        dogdaycare.requestCheckIn(dog2);
        dogdaycare.requestCheckIn(dog3);
        dogdaycare.requestCheckIn(dog4);
        dogdaycare.requestCheckIn(dog5);

        String actual = "DOGS REGISTERED: " + 6 + " DOGS CHECKED IN: " + 5 + " AVAILABLE SPACE: " + 0;
        String expected = dogdaycare.getSummary();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void TestSummaryUpdation() {
        DogDayCare dogdaycare = new DogDayCare();

        Dog dog1 = new Dog(101, "Puppy", "Bulldog", 4, "Krishna");
        Dog dog2 = new Dog(102, "Bruno", "Shih-tzu", 3, "Balram");
        Dog dog3 = new Dog(103, "Doggy", "Labrador", 7, "Radha");
        Dog dog4 = new Dog(104, "Sandy", "Pomorian", 5, "Yashodha");
        Dog dog5 = new Dog(105, "Pinky", "Golden Retriever", 10, "Nanda");
        Dog dog6 = new Dog(106, "Monkey", "Beagle", 10, "Kamsa");

        dogdaycare.addDog(dog1);
        dogdaycare.addDog(dog2);
        dogdaycare.addDog(dog3);
        dogdaycare.addDog(dog4);
        dogdaycare.addDog(dog5);
        dogdaycare.addDog(dog6);

        dogdaycare.requestCheckIn(dog1);
        dogdaycare.requestCheckIn(dog2);
        dogdaycare.requestCheckIn(dog3);
        dogdaycare.requestCheckIn(dog4);
        dogdaycare.requestCheckIn(dog5);

        String actual = "DOGS REGISTERED: " + 6 + " DOGS CHECKED IN: " + 5 + " AVAILABLE SPACE: " + 0;
        String expected = dogdaycare.getSummary();
        Assertions.assertEquals(expected, actual);

        dogdaycare.checkOutDog(dog5);

        String updatedActual = "DOGS REGISTERED: " + 6 + " DOGS CHECKED IN: " + 4 + " AVAILABLE SPACE: " + 1;
        String updatedExpected = dogdaycare.getSummary();
        Assertions.assertEquals(updatedExpected, updatedActual);

    }

}
