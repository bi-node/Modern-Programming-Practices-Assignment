package lesson9Stream.Optional;

import java.util.*;

class Employeee {
    private int id;
    private String name;
    private int salary;

    public Employeee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class OrElseGetExample {
    public static void main(String[] args) {
        // Simulating a list of employees
        List<Employeee> employees = Arrays.asList(
                new Employeee(1, "Alice", 5000),
                new Employeee(2, "Bob", 6000),
                new Employeee(3, "Charlie", 7000)
        );

        // ID of the employee we want to find
        int targetId = 4;

        // Using orElseGet to fetch employee details from an external service if not found in the list
        Employeee employee = employees.stream()
                .filter(e -> e.getId() == targetId)
                .findFirst()
                .orElseGet(() -> {
                    // Simulating fetching employee details from an external service
                    System.out.println("Fetching employee details from external service...");
                    return new Employeee(targetId, "External Employee", 8000);
                });

        System.out.println("Employee details: " + employee);
    }
}
