package module03.HomeWork33;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

//    Create two constructors with fields startDate, name;
//      and hourseDuration, name, teacherName.

    public Course(Date startDate, String name) {
        this.setStartDate(startDate);
        this.setName(name);
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.setName(name);
        this.setHoursDuration(hoursDuration);
        this.setTeacherName(teacherName);
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.setName(name);
        this.setHoursDuration(hoursDuration);
        this.setTeacherName(teacherName);
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
