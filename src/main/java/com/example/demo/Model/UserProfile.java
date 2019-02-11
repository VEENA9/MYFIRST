package com.example.demo.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection="Uprofile")

public class UserProfile {

    @Id
    private String pId;
    private  String uName;
    private  double wSaved;
    private  double cSaved;
    private  double pScore;
    private String VIN;
    private String color;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    private Integer miles;

    public UserProfile() {


    }

    public UserProfile(String pId, String uName, double wSaved, double cSaved, double pScore) {
        this.pId = pId;
        this.uName = uName;
        this.wSaved = wSaved;
        this.cSaved = cSaved;
        this.pScore = pScore;
    }

    public String getpId() {
        return pId;
    }

    public String getuName() {
        return uName;
    }

    public double getwSaved() {
        return wSaved;
    }

    public double getcSaved() {
        return cSaved;
    }

    public double getpScore() {
        return pScore;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setwSaved(double wSaved) {
        this.wSaved = wSaved;
    }

    public void setcSaved(double cSaved) {
        this.cSaved = cSaved;
    }

    public void setpScore(double pScore) {
        this.pScore = pScore;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "pId='" + pId + '\'' +
                ", uName='" + uName + '\'' +
                ", wSaved=" + wSaved +
                ", cSaved=" + cSaved +
                ", pScore=" + pScore +
                '}';
    }


}



