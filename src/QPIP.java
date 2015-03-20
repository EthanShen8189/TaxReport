/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class QPIP extends Deduction {

    protected static double qpipDeduction;

    public static double calculateQPIPTax(Employee e) {

        if(e.getAnnualSalary() >= 69000)
            qpipDeduction = 385.71;

        else
            qpipDeduction = e.getAnnualSalary() * 0.00559;

        return qpipDeduction;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
