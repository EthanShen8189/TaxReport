/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class EI extends Deduction {

    protected static double eiDeduction;


    public static double calculateEI(Employee e) {

        if(e.getAnnualSalary() >= 48600)
            eiDeduction = 743.58;

        else
            eiDeduction = (int)(e.getAnnualSalary()/100)*1.53;

        return eiDeduction;
    }

    @Override
    public double calculateTax() {
        return eiDeduction;
    }
}
