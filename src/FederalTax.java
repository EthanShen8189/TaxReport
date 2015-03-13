/**
 * Created by Racoonsy on 15-03-12.
 */
public class FederalTax extends Deduction {

    private double federalTaxDeduction;

    @Override
    public double calculateTax(Employee e) {
        if(e.getAnnualSalary() <= 43953)
            federalTaxDeduction = e.getAnnualSalary() * 0.15;

        else if(e.getAnnualSalary() > 43953 && e.getEmployeeNumber() <= 87907)
            federalTaxDeduction = 43953 * 0.15 +(e.getAnnualSalary()- 43953)*0.22;

        else if(e.getAnnualSalary() > 87907 && e.getAnnualSalary() <= 136270)
            federalTaxDeduction = 43953 * 0.15 + 43953 * 0.22 + (e.getAnnualSalary() - 87907)*0.26;

        else if (e.getEmployeeNumber() >= 136271)
            federalTaxDeduction = e.getEmployeeNumber()*0.29;

        return federalTaxDeduction;
    }
}
