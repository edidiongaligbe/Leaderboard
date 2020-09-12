package com.example.androidleadersboard;

import java.util.ArrayList;

public class LearnersData {
    private String name;
    private String info;

    public LearnersData (String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    /*private static int lastContactId = 0;

    public static ArrayList<LearnersData> createLearnersList(int numContacts) {
        ArrayList<LearnersData> contacts = new ArrayList<LearnersData>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new LearnersData("Person " + ++lastContactId, "i <= numContacts / 2"));
        }

        return contacts;
    }*/
}
