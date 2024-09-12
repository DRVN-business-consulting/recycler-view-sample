package dev.jianastrero.myawesomeresume.model;

public class Pokemon {
    private String name;
    private int imageResId;

    public Pokemon(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
