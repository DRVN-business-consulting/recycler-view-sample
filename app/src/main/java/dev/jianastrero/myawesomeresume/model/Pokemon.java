package dev.jianastrero.myawesomeresume.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Pokemon {
    public int id;
    public Name name;
    public ArrayList<String> type;
    public Base base;
    public String species;
    public String description;
    public Evolution evolution;
    public Profile profile;
    public Image image;
}


