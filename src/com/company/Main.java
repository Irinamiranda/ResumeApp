package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.ArrayList;
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

        ArrayList<Resume> resumes = new ArrayList<>();
        resumes.add( new Resume("Irina", "Smirnova", "is@gmail.com", "571 425 9631"));
        resumes.add(createResume());


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


    public static Resume createResume(ArrayList<Education> educations, ArrayList<Experience> experiences, ArrayList<String> skills){
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

            System.out.println("add education? y/n ");

            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {

                Education newEducation = createEducation();

                educations.add(newEducation);

            } else {

                break;

            }
            System.out.println("add experience? y/n ");

            String answer2 = scan.nextLine();

            if (answer2.equalsIgnoreCase("y")) {

                Experience newExperience = createExperience();

                experiences.add(newExperience);

            } else {

                break;

            }

        }
        newResume.getEducations().add(createEducation());
        newResume.getExperiences().add(createExperience());
        newResume.getSkills().add(selectSkills());

        return newResume;

    }
}
