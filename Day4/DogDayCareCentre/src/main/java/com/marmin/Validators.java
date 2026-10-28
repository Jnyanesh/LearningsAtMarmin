package com.marmin;

public class Validators {

    public  static boolean IsDogIdDuplicate(int dogId, Dogs dogs) {
        int dogcount = 0;

        for (int i =0;i<dogs.size();i++) {
            if (dogs.get(i).getDogId() == dogId) {
                dogcount++;
            }
        }
        if (dogcount > 1) {
            return true;
        }

        return false;
    }

    public static boolean IsStaffIdDuplicate(int staffId, Staffs staffs) {
        int staffcount = 0;

        for (int i =0;i< staffs.size();i++) {
            if (staffs.get(i).getStaffId() == staffId) {
                staffId++;
            }
        }
        if (staffcount > 1) {
            return true;
        }

        return false;
    }

    public static boolean IsDogRegistered(int dogId, Dogs dogs) {
        boolean registered = false;

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getDogId() == dogId) {
                registered = true;
            }
        }
        if (registered) {
            return true;
        }

        return false;

    }

    public static boolean ValidateDog(Dog dog){
        if (dog.getBreed() == "" || dog.getDogName() == "" || dog.getDogId() <= 0 || dog.getAge() <= 0
                || dog.getOwnerName() == "" || dog.getCheckIn()) {
            return false;
        }
        return true;
    }

    public static boolean ValidateStaff(Staff staff){
        if (staff.getStaffId() <= 0 || staff.getName() == "") {
            return false;
        }
        return true;
    }

}
