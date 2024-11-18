package co2123.hw1.domain;

public class Stylist {
    private String name;
    private String skills;
    private String expertise;
    private int price;

    // No-argument constructor
    public Stylist() {
    }

    // Parameterized constructor
    public Stylist(String name, String skills, String expertise, int price) {
        this.name = name;
        this.skills = skills;
        this.expertise = expertise;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
