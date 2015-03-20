/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class Employee {
    private long employeeNumber;
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double hourlyWage;
    private double annualSalary;
    private double deduction;
    private double netSalary;

    public Employee(){
        employeeNumber = 0;
        firstName = null;
        lastName = null;
        hoursWorked = 0;
        hourlyWage = 0;
        annualSalary = 0;
        deduction = 0;
        netSalary = 0;

    }

    public Employee(long employeeNumber, String firstName, String lastName,
                    double hoursWorked, double hourlyWage, double annualSalary,
                    double deduction,double netSalary) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        this.annualSalary = annualSalary;
        this.deduction = deduction;
        this.netSalary = netSalary;
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

    public static double getDeduction(Employee e) {
        return e.deduction;
    }

    public void calculateDeduction(Employee e){
        ProvincialTax.calculateProvincialTax(e);
        FederalTax.calculateFederalTax(e);
        QPIP.calculateQPIPTax(e);
        RRQ.calculateRRQTax(e);
        EI.calculateEI(e);
        deduction = Math.floor(EI.eiDeduction + FederalTax.federalTaxDeduction+ProvincialTax.provincialTaxDeduction+
                            RRQ.rrqDeduction+QPIP.qpipDeduction);
    }
    public double getAnnualSalary() {
        return annualSalary;
    }



    public void setAnnualSalary() {

        annualSalary = Math.floor(getHourlyWage()*getHoursWorked()*52);
    }
    public void setNetSalary(){
        netSalary = Math.floor(annualSalary - deduction);
    }

    public double getNetSalary(){
        return netSalary;
    }

}
