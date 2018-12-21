package ru.itpark.domain;

public class TShirt extends Product {
    private String gender;
    private int size;

    public TShirt(int id, String category, String name, int price, String description, String gender, int size) {
        super(id, category, name, price, description);
        this.gender = gender;
        this.size= size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
