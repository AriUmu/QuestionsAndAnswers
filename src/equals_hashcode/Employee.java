package equals_hashcode;

import java.util.Date;
import java.util.Objects;

//pojo  старый добрый
public class Employee {
    private String username;
    private Date dateStartWork;
    private int age;

    public Employee(String username, Date dateStartWork, int age) {
        this.username = username;
        this.dateStartWork = dateStartWork;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateStartWork() {
        return dateStartWork;
    }

    public void setDateStartWork(Date dateStartWork) {
        this.dateStartWork = dateStartWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age
                && Objects.equals(username, employee.username)
                && Objects.equals(dateStartWork, employee.dateStartWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, dateStartWork, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", dateStartWork=" + dateStartWork +
                ", age=" + age +
                '}';
    }
}
