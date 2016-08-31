package module03.OfflineOn20160831.Task01;

public class Worker extends Person {
    private String address;
    private int salary;

    public Worker() {
        this("", 0);
    }

    public Worker(String address, int salary) {
        super();
        this.address = address;
        this.salary = salary;
    }

    public Worker(boolean gender, String firstName, String secondName, int age, String address, int salary) {
        super(gender, firstName, secondName, age);
        this.address = address;
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

