/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class FederalTax extends Deduction {

    protected static double federalTaxDeduction;


    public static double calculateFederalTax(Employee e) {
        if(e.getAnnualSalary() <= 43953)
            federalTaxDeduction = e.getAnnualSalary() * 0.15;

        else if(e.getAnnualSalary() > 43953 && e.getAnnualSalary() <= 87907)
            federalTaxDeduction = 43953 * 0.15 +(e.getAnnualSalary()- 43953)*0.22;

        else if(e.getAnnualSalary() > 87907 && e.getAnnualSalary() <= 136270)
            federalTaxDeduction = 43953 * 0.15 + 43953 * 0.22 + (e.getAnnualSalary() - 87907)*0.26;

        else if (e.getAnnualSalary() >= 136271)
            federalTaxDeduction = e.getAnnualSalary()*0.29;

        return federalTaxDeduction;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
