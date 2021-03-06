package com.company;

public class Education {
    private String school;
    private String year;
    private String degree;
    private String major;

    public Education(){

    }

    public Education(String school, String year, String degree, String major){
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "School: " + getSchool() + " Year: " + getYear() + " Degree: " + getDegree() + " Major: " + getMajor();
    }
}
