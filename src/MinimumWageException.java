/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class MinimumWageException extends Exception {

    public MinimumWageException(double minimumWage){
        super("MinimumWageException");
    }

    public MinimumWageException(){
        super("MinimumWageException");
    }

    public MinimumWageException(String message){
        super(message);
    }
}
