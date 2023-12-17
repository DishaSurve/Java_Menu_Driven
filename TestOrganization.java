package Tester;
import Code.Employee;
import Code.Manager;
import Code.Worker;

import java.util.Scanner;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] organization = new Employee[10]; // Assuming a maximum of 10 employees for simplicity

        int option;
        do {
            System.out.println("Options:");
            System.out.println("1. Hire Manager");
            System.out.println("2. Hire Worker");
            System.out.println("3. Display information of all employees & display net salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    hireManager(scanner, organization);
                    break;
                case 2:
                    hireWorker(scanner, organization);
                    break;
                case 3:
                    displayEmployeeInformation(organization);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option<= 4);
    }

    private static void hireManager(Scanner scanner, Employee[] organization) {
        System.out.println("Enter Manager details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Department ID: ");
        int deptId = scanner.nextInt();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Performance Bonus: ");
        int perfBonus = scanner.nextInt();

        Manager manager = new Manager(id,name,deptId,basicSalary,perfBonus);
        addEmployeeToOrganization(organization, manager);
    }

    private static void hireWorker(Scanner scanner, Employee[] organization) {
        System.out.println("Enter Worker details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Department ID: ");
        int deptId = scanner.nextInt();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        int hourlyRate = scanner.nextInt();

        Worker worker = new Worker(id,name,deptId,basicSalary,hourlyRate,hoursWorked);
        addEmployeeToOrganization(organization, worker);
    }

    private static void addEmployeeToOrganization(Employee[] organization, Employee employee) {
        for (int i = 0; i < organization.length; i++) {
            if (organization[i] == null) {
                organization[i] = employee;
                System.out.println("Employee hired successfully!");
                break;
            }
        }
    }

    private static void displayEmployeeInformation(Employee[] organization) {
        for (Employee emp : organization) {
            if (emp != null) {
                System.out.println(emp);
                System.out.println("Net Salary: " + emp.ComputeNetSal());
                System.out.println("--------------------");
            }
        }
    }
}
