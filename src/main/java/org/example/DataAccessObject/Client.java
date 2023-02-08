package org.example.DataAccessObject;

public class Client {
    private String name;
    private String lastName;
    private Integer birthYear;
    private String city;

    public Client(String name, String lastName, Integer birthYear, String city) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
