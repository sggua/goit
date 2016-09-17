package module06.homework;

public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                id +
                ", " + firstName +
                ", " + lastName +
                ", " + salary +
                ", " + balance +
                '}';
    }
}
