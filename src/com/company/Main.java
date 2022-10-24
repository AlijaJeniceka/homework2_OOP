package com.company;

public class Main {
    public static void main(String[] args){

        Country[] country = new Country[4];
        country[0] = new Country("Germany", 1200);
        country[1] = new Country("Italy", 900);
        country[2] = new Country("Austria", 800);
        country[3] = new Country("Latvia", 700);

        Country measurable = (Country) maximum(country);
        System.out.println("Country with the biggest area " + measurable.getMeasure() + " is " + measurable.getCountryName());

        Country[] country2 = new Country[4];
        country2[0] = new Country("Germany", 100);
        country2[1] = new Country("Italy", 900);
        country2[2] = new Country("Austria", 800);
        country2[3] = new Country("Latvia", 100);

        Country measurable2 = (Country) maximum(country2);
        System.out.println("Country with the biggest area " + measurable2.getMeasure() + " is " + measurable2.getCountryName());

    }

    public static Measurable maximum (Measurable[] objects) {
        Measurable maxObj = null;
        if (objects.length == 0) {
            return null;
        }
        double max = 0;
        for (Measurable obj : objects) {

            if(obj.getMeasure() > max){
                 max = obj.getMeasure();
                 maxObj = obj;
            }
        }
        return maxObj;
    }
}
