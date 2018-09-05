package com.zn.springbootdemo.data.mongo.bean;

/**
 * Created by ning on 5/9/18.
 * <p>
 * 工作地
 */
public class Location {

    private String place;
    private String year;

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
