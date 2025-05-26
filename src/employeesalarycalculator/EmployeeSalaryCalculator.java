
package employeesalarycalculator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmployeeSalaryCalculator {

    
    public static void main(String[] args) {
       
        // scanner object input
        Scanner input = new Scanner(System.in);
        
        //Gets user data input
        System.out.print("Enter First Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Surname: ");
        String surname = input.nextLine();
        
        System.out.print("Enter Age: ");
        int age = input.nextInt();
                
        System.out.print("Enter Monthly Salary: ");
        int monthlySalary = input.nextInt();
        
        // Calculating the weekly earnings.
        double WeeklySalary = monthlySalary / 4;
        
        // Displays the results
        System.out.print("The total weekly age is: R" + WeeklySalary);
    }
    
}


// reference 2025 June
