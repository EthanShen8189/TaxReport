import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** COMP249 Assignment 3
 *  Author: Yang Shen(7159390)
 *  Due : 2015/03/20
 */
public class Driver {

    public static void main(String[] arg){

        ArrayList <Employee> employeeArrayList = new ArrayList<Employee>();  //Creating an arrayList for holding the correct information of employee
        Scanner fileReader = null;
        Scanner errorFileReader=null;
        PrintStream fileWriter = null;
        PrintStream report=null;
        int goodFileCounter = 0;
        int badFileCounter = 0;
        int badWageCounter = 0;


        try {                                                                      //Creating the inputStream for payroll file.
            fileReader = new Scanner(new FileInputStream("comp249-payroll.txt"));
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {                                                               //Creating an inputStream for read the error.txt
            errorFileReader = new Scanner(new FileInputStream("error.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {                                           //Creating the output file for holding error lines.
            fileWriter = new PrintStream("error.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {                                           //Creating the output file for print the tax report.
            report = new PrintStream("Tax Report.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        do{                                     //Enter the correct information to arrayList,
                                                //Output the error lines to error.txt.
            try{
                long a = fileReader.nextLong();
                String b = fileReader.next();
                String c = fileReader.next();
                double d = fileReader.nextDouble();
                double e = fileReader.nextDouble();
                if(e<=10.35)                                //Throw exception when the hourly wage is under 10.35.
                    throw new MinimumWageException();
                Employee employee = new Employee(a,b,c,d,e,0,0,0);      //Creating employee object.
                employeeArrayList.add(employee);                //Add the object to arrayList.


            }

            catch (MinimumWageException e){
                fileWriter.print(String.valueOf(fileReader.nextLine()));    //Write the minimum wage error line to the file.
            }
            catch (InputMismatchException e){
               fileWriter.println(String.valueOf(fileReader.nextLine()));   //Write the wrong data type lines into error file.

            }

        }
        while(fileReader.hasNext());

            fileReader.close();
            fileWriter.close();



        employeeArrayList.trimToSize();         //trim the array.

           for (Employee e : employeeArrayList) {           //set employee's annual salary and deduction.

               e.setAnnualSalary();
               e.calculateDeduction(e);
               e.setNetSalary();
           }


        //Printing the report to Tax Report.txt
        report.println(">Opeaning file payroll..");
        report.println();
        report.println(">Reading file payroll..");
        report.println();
        report.println(">Error lines found in file payroll:");
        report.println();
        while(errorFileReader.hasNext()){
            report.println(errorFileReader.nextLine());
        }
        report.println();
        report.println(">"+goodFileCounter+badFileCounter+" lines read from file payroll");
        report.println();
        report.println(">"+badFileCounter+badWageCounter+" lines written to error file");
        report.println();
        report.println(">Calculating deductions");
        report.println();
        report.println(">Writing report file");
        report.println();
        report.println();
        report.println("Report file");
        report.println();
        report.println("                                      Harbour Industries");
        report.println("                                      ==================");
        report.println("Employee Number      " +
                "First Name      " +
                "Last Name      " +
                "Gross Salary      " +
                "Deduction      " +
                "Net Salary      ");
        for(Employee e: employeeArrayList){

            report.println(e.getEmployeeNumber() + "                " + e.getFirstName() + "          " +
                    e.getLastName() + "           $" +
                    e.getAnnualSalary() + "        $" +
                    e.getDeduction(e) + "          $" +
                    e.getNetSalary());
        }


    }



}







