/**
 * Created by Racoonsy on 15-03-12.
 */
public class EI extends Deduction {

    private double eiDeduction;

    @Override
    public double calculateTax(Employee e) {

        if(e.getAnnualSalary() >= 48600)
            eiDeduction = 743.58;

        else
            eiDeduction = (int)(e.getAnnualSalary()/100)*1.53;

        return eiDeduction;
    }
}
