package com.company;

public class Adress {
    public String addrest(String country) {
        return String.format("country: "+ country);
    }

    public String addrest(String country, String city) {
        return String.format("country: " +country+ ", city: "+city);
    }

    public String addrest(String country, String city, int code) {
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code);
    }

    public String addrest(String country, String city, int code, String street) {
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street);
    }

    public String addrest(String country, String city, int code, String street, int apartment) {
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street+ ", apartment: " +apartment);
    }
}
