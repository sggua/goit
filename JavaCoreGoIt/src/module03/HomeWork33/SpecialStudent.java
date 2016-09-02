package module03.HomeWork33;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

//    Create three constructors: two the same as in CollegeStudend
//      and one with secretKey field.

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age,
                          String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, coursesTaken, age, collegeName, rating, id);
        this.secretKey=secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
