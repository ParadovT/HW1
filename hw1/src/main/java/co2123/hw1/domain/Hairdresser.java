package co2123.hw1.domain;

import java.util.List;

public class Hairdresser {
    private int id;
    private String city;
    private String speciality;
    private List<Stylist> stylists;

    // No-argument constructor
    public Hairdresser() {
    }

    // Parameterized constructor
    public Hairdresser(int id, String city, String speciality, List<Stylist> stylists) {
        this.id = id;
        this.city = city;
        this.speciality = speciality;
        this.stylists = stylists;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Stylist> getStylists() {
        return stylists;
    }

    public void setStylists(List<Stylist> stylists) {
        this.stylists = stylists;
    }
}
