package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> skills = new ArrayList<>();

        skills.add("Fundamental");

        skills.add("Novice");

        skills.add("Intermediate");

        skills.add("Advanced");

        skills.add("Expert");




        ArrayList<Education> educations = new ArrayList<>();
        ArrayList<Experience> experiences = new ArrayList<>();

        ArrayList<Resume> resumes = new ArrayList<>();

        while (true) {
            System.out.println("What do you wish to do? to add resume [addresume]/ to list resume [listresume]/ exit");
            Scanner scan = new Scanner(System.in);
            String keyword = scan.nextLine();
            if (keyword.equalsIgnoreCase("addresume")) {
                Resume resume = createResume(educations, experiences, skills);
                resumes.add(resume);
            } else if (keyword.equalsIgnoreCase("listresume")) {

                for (Resume eachResume : resumes) {
                    System.out.println(eachResume);
                    System.out.println("Education: " + eachResume.getEducations());
                    System.out.println("Experience: " + eachResume.getExperiences());
                    System.out.println("Skills: " + eachResume.getSkills());

                }
            } else if (keyword.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    public static Education createEducation(){
        Education newEducation = new Education();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your school");
        String school = scan.nextLine();
        newEducation.setSchool(school);

        System.out.println("Enter a year");
        String year = scan.nextLine();
        newEducation.setYear(year);

        System.out.println("Enter a degree");
        String degree = scan.nextLine();
        newEducation.setDegree(degree);

        System.out.println("Enter your major");
        String major = scan.nextLine();
        newEducation.setMajor(major);


        return newEducation;

    }

    public static Experience createExperience() {
        Experience newExperience = new Experience();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a company");
        String company = scan.nextLine();
        newExperience.setCompany(company);

        System.out.println("Enter title");
        String title = scan.nextLine();
        newExperience.setTitle(title);

        System.out.println("Enter a date");
        String date = scan.nextLine();
        newExperience.setDate(date);

        System.out.println("Enter description");
        String description = scan.nextLine();
        newExperience.setDescription(description);

        return newExperience;
    }
    public static String selectSkills(ArrayList<String> skills) {

        System.out.println("----");

        for (int i = 0; i < skills.size(); i++) {

            String a = skills.get(i);

            System.out.println((i + 1) + ": " + a);

        }

        System.out.println("Please select level of skills (or 0 to skip):");

        int idx = new Scanner(System.in).nextInt();

        return idx == 0 ? null : skills.get(idx - 1);

    }


    public static Resume createResume(ArrayList<Education> educations, ArrayList<Experience> experiences, ArrayList< String> skills){
        Resume newResume = new Resume();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        newResume.setFirstName(firstName);

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        newResume.setLastName(lastName);

        System.out.println("Enter your eMail");
        String email = scan.nextLine();
        newResume.seteMail(email);

        System.out.println("Enter your phone number");
        String phone = scan.nextLine();
        newResume.setPhone(phone);

        while (true) {

            System.out.println("Would you like to add education or experience? y/n ");

            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {

                Education newEducation = createEducation();

                educations.add(newEducation);
                newResume.getEducations().add(newEducation);

            } else {

                break;

            }
            System.out.println("add experience? y/n ");

            String answer2 = scan.nextLine();

            if (answer2.equalsIgnoreCase("y")) {

                Experience newExperience = createExperience();

                experiences.add(newExperience);
                newResume.getExperiences().add(newExperience);

            } else {

                break;

            }
        }

        newResume.getSkills().add(selectSkills(skills));

        return newResume;

    }
}
