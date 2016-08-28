package module03.HomeWork33;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Date start = new Date();
        Course[] courses = new Course[0];

        Course course1 = new Course(start, "Java");
        Course course2 = new Course(40, "Math", "Arhimed");
        Course course3 = new Course(20, "Logic", "Holmes");
        Course course4 = new Course(10, "History", "Subtelniy");
        Course course5 = new Course(120, "Basketball", "O'Neal");

        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("White", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Alex", "Boldwin", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("Cooper", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Phil", "Collins", 3, courses, 50,
                "Stanford", 1, 1234567890L);

        SpecialStudent specialStudent1 = new SpecialStudent("Paul", "Scott", 4);
        SpecialStudent specialStudent2 = new SpecialStudent("Brown", courses);
        SpecialStudent specialStudent3 = new SpecialStudent("John", "Ripper", 5, courses, 20,
                "MIT", 1, 987654321L, 876234567654L);

    }

}
