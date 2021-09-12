package week2;

import java.util.Scanner;

public class Salary_Main {
    public static void main(String[] args){
        System.out.println("Please enter your working years ");
        Scanner working_years= new Scanner(System.in);
        int years= working_years.nextInt();
        Employee employee = new Employee();
        employee.years = years;
        employee.raise_amount();

    }
}
