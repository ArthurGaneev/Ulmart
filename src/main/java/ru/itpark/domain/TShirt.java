package ru.itpark.domain;

public class TShirt extends Product {
    private int gender;
    private int size;

    public TShirt(int id, String category, String name, int price, String description, int gender, int size) {
        super(id, category, name, price, description);
        this.gender = gender;
        this.size = size;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
