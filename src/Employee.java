import java.util.*;
/**
 * Created by Racoonsy on 15-03-12.
 */
public class Employee {
    private long employeeNumber;
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double hourlyWage;
    private static double annualSalary;

    public Employee(long employeeNumber, String firstName, String lastName,
                    double hoursWorked, double hourlyWage) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public static double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary() {
        annualSalary = hourlyWage*hoursWorked*52;
    }

    Scanner fileReader = new Scanner("comp249-payroll.txt");

    public void readFile(){
        while(fileReader.hasNext()){

        }
    }

}
