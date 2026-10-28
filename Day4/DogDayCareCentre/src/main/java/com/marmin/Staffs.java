package com.marmin;

public class Staffs {
    private Staff[] staffs;
    private int count;

    public Staffs(int capacity) {
        staffs = new Staff[capacity];
        count = 0;
    }

    public void add(Staff staff) {
        if (count == staffs.length || staffs.length == 0) {
            IncreaseCapacity();
        }
        staffs[count] = staff;
        count++;
    }

    private void IncreaseCapacity() {
        int newCapacity = staffs.length + 1;
        Staff[] newstaffs = new Staff[newCapacity];
        for (int i = 0; i < count; i++) {
            staffs[i] = staffs[i];
        }
        staffs = newstaffs;
    }

    public int size() {
        return staffs.length;
    }

    public Staff get(int index){
        return staffs[index];
    }

    public Staff getLastStaff(){
        return staffs[staffs.length-1];
    }
}
