package com.marmin;

public class Staff {
    private final int staffId;
    private String name;

    Staff(int staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }
}
