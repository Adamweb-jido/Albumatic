package com.adamweb.trialapplication;

public class DataItem {
    String name;
    String admissionNumber;
    String combination;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber;
    int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public DataItem(String name, String admissionNumber, String combination, String phoneNumber, int image) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.combination = combination;
        this.phoneNumber = phoneNumber;
        this.image = image;
    }
}
