package com.sobol.user.recyclerview;


import java.io.Serializable;

public class VisitedPlaces implements Serializable {
    public VisitedPlaces(String title, String imgPath, float latitude, float longitude) {
        this.title = title;
        this.imgPath = imgPath;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    String title;
    String imgPath;
    float latitude;
    float longitude;
}
