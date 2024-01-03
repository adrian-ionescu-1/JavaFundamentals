package exercises;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    private String name;
    private String email;
    private int salary;
    private LocalDate hireDate;

    public Employee (String name, String email, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Email invalid");
        }
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    private boolean isEmailValid(String email) {

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    private int[] salaryYears = new int[10];
    private int[] salaryValues = new int[10];
    private int salaryHistoryIndex = 0;

    public void addToSalaryHistory(int year, int salary) {
        if (salaryHistoryIndex < salaryYears.length) {
            salaryYears[salaryHistoryIndex] = year;
            salaryValues[salaryHistoryIndex] = salary;
            salaryHistoryIndex++;
        }
    }

    public void printSalaryHistory() {
        for (int i = 0; i < salaryHistoryIndex; i++) {
            System.out.println("Anul " + salaryYears[i] + " - " + salaryValues[i] + " lei");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
