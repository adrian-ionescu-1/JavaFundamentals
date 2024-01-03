package exercises;

import java.time.LocalDate;
import java.time.Period;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void  printAllEmployees() {
        System.out.println("Lista cu angajatii este: ");
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(employees[i]);
        }
    }

    public void showNumberOfEmployeesWithExperience(int years) {

        int numberOfEmployees = 0;
        for (Employee element : employees) {
            if(Period.between(element.getHireDate(), LocalDate.now()).getYears() >= years) {
                numberOfEmployees++;
            }
        }
        System.out.println("Numarul de angajati cu o vechime mai mare de " + years + "este: " + numberOfEmployees);
    }

    public void increaseSalariesAnnually(double percentage) {
        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i].getSalary();
            int newSalary = (int) (oldSalary * (1 + percentage / 100));
            employees[i].addToSalaryHistory(LocalDate.now().getYear(), oldSalary);
            employees[i].setSalary(newSalary);
        }
    }
}
