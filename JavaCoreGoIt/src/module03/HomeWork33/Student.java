package module03.HomeWork33;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

//    With 2 constructors firstName, lastName, group;
//      and lastName, coursesTaken.

    public Student(String firstName, String lastName, int group) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGroup(group);
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.setLastName(lastName);
        this.setCoursesTaken(coursesTaken);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public int getAge() {
        return age;
    }
}
