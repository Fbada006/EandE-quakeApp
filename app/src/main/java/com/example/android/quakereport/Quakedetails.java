package com.example.android.quakereport;

public class Quakedetails {
    private String Date;
    private  String Magnitude;
    private String City;

    public Quakedetails (String qDate, String qMagnitude, String qCity){
        Date = qDate;
        Magnitude = qMagnitude;
        City = qCity;
    }

    public String getCity() {
        return City;
    }

    public String getDate() {
        return Date;
    }

    public String getMagnitude() {
        return Magnitude;
    }

}

