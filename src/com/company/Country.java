package com.company;

public class Country implements Measurable{

    private String countryName;
    private double countryArea;

    public Country(String countryName, double countryArea) {
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    @Override
    public double getMeasure() {
        return countryArea;
    }
}
