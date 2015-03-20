/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class RRQ extends Deduction {

    protected static double rrqDeduction;


    public static double calculateRRQTax(Employee e) {
        if(e.getAnnualSalary() >= 52500)
            rrqDeduction = 2535.75;
        else
            rrqDeduction = e.getAnnualSalary()*0.05175;

        return rrqDeduction;

    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
