package exercises;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Employee violeta = new Employee("Violeta", "vvioleta@gmail.com", 2000, LocalDate.of(2014, Month.FEBRUARY, 14));
        Employee maria = new Employee("Maria Popescu", "mariapopescu@gmail.com", 3000, LocalDate.of(2022, Month.AUGUST, 22));
        Employee radu = new Employee("Radu Ion", "rion@gmail.com", 2500, LocalDate.of(2016, Month.MARCH, 5));

        Company consultingSrl = new Company(new Employee[]{violeta, maria, radu});

        consultingSrl.printAllEmployees();
        consultingSrl.showNumberOfEmployeesWithExperience(5);

        Employee[] employees = {violeta, maria, radu};

        // Măriri salarii anual și afișare istoric salarial
        consultingSrl.increaseSalariesAnnually(5);
        System.out.println("Dupa marirea salariilor:");
        consultingSrl.printAllEmployees();

        // Afișare istoric salarial pentru fiecare angajat
        System.out.println("\nIstoric salarial:");
        for (Employee employee : employees) {
            System.out.println("Istoric salarial pentru " + employee.getName() + ":");
            employee.printSalaryHistory();
            System.out.println();
        }
    }
}
