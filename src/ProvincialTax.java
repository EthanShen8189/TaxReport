/**
 * Created by Racoonsy on 15-03-12.
 */
public class ProvincialTax extends Deduction {

    private double provincialTaxDeduction;

    @Override
    public double calculateTax(Employee e) {
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

}
