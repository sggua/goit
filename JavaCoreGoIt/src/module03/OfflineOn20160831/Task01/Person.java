package module03.OfflineOn20160831.Task01;

public class Person {
    private boolean isMan; // true = male ; false = female;
    private String firstName;
    private String secondName;
    private int age;

    public Person() {
        this(true, "", "", 0);
    }

    public Person(boolean isMan, String firstName, String secondName, int age) {
        this.isMan = isMan;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        this.isMan = man;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
