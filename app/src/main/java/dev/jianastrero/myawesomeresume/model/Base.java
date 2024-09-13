package dev.jianastrero.myawesomeresume.model;

import com.google.gson.annotations.SerializedName;

public class Base {
    @SerializedName("HP")
    public int hP;
    @SerializedName("Attack")
    public int attack;
    @SerializedName("Defense")
    public int defense;
    @SerializedName("Sp. Attack")
    public int spAttack;
    @SerializedName("Sp. Defense")
    public int spDefense;
    @SerializedName("Speed")
    public int speed;
}
