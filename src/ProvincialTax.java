/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class ProvincialTax extends Deduction {

    protected static double provincialTaxDeduction;


    public static double calculateProvincialTax(Employee e) {
        if(e.getAnnualSalary() <= 41495)
            provincialTaxDeduction = e.getAnnualSalary()*0.16;

        else if (e.getAnnualSalary() > 41495 && e.getAnnualSalary() <= 82895)
            provincialTaxDeduction = e.getAnnualSalary()*0.2;

        else if (e.getAnnualSalary() > 82895 && e.getAnnualSalary() <= 100970)
            provincialTaxDeduction = e.getAnnualSalary()*0.24;

        else if (e.getAnnualSalary() > 100970)
            provincialTaxDeduction = e.getAnnualSalary()*0.2575;

        return provincialTaxDeduction;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
