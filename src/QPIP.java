/**
 * Created by Racoonsy on 15-03-12.
 */
public class QPIP extends Deduction {

    private double qpipDeduction;

    @Override
    public double calculateTax(Employee e) {

        if(e.getAnnualSalary() >= 69000)
            qpipDeduction = 385.71;

        else
            qpipDeduction = e.getAnnualSalary() * 0.00559;

        return qpipDeduction;
    }
}
