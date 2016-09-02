package module03.HomeWork33;

public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

//    Create three constructors:
//      two the same as in Student
//      and one with all the fields of the class.

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age,
                          String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.setCoursesTaken(coursesTaken);
        this.setAge(age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
