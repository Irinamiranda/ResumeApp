package com.company;

import java.util.ArrayList;

public class Resume {

    private String firstName;
    private String lastName;
    private String eMail;
    private String phone;
    private ArrayList<Education> educations = new ArrayList<>();
    private ArrayList<Experience> experiences = new ArrayList<>();
    private ArrayList<String> skills = new ArrayList<>();



    public Resume(){
        this.educations = new ArrayList<>();
        this.experiences = new ArrayList<>();
        this.skills = new ArrayList<>();

    }
    public Resume(String firstName, String lastName, String eMail, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phone = phone;
        this.educations = new ArrayList<>();
        this.experiences = new ArrayList<>();
        this.skills = new ArrayList<>();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }




    @Override
    public String toString() {
        return "Name: " + getFirstName() + "  " + getLastName() + " eMail Address: " + geteMail() + " phoneNumber: " + getPhone();
    }
}
