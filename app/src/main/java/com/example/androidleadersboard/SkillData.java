package com.example.androidleadersboard;

public class SkillData {

    private String name;
    private String info;

    public SkillData (String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
