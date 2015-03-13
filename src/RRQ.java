/**
 * Created by Racoonsy on 15-03-12.
 */
public class RRQ extends Deduction {

    private double rrqDeduction;

    @Override
    public double calculateTax(Employee e) {
        if(e.getAnnualSalary() >= 52500)
            rrqDeduction = 2535.75;
        else
            rrqDeduction = e.getAnnualSalary()*0.05175;

        return rrqDeduction;

    }
}
