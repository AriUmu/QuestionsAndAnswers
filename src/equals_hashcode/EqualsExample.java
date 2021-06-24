package equals_hashcode;

import java.util.Date;

public class EqualsExample {

    public static void main(String[] args) {
        Date dateStartWork = new Date();

        Employee employee1 = new Employee("Inanov", dateStartWork, 25);

        Employee employee2 = new Employee("Inanov", dateStartWork, 25);

        System.out.println(employee1.equals(employee2));


        System.out.println(employee1.hashCode() + "   -> hashcode employee1");
        System.out.println(employee2.hashCode() + "   -> hashcode employee2");

    }
}
