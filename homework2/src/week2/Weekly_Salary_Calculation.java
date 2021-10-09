package week2;
import java.util.Scanner;
public class Weekly_Salary_Calculation {
    public double salary_calculation() {
        System.out.println("Please enter base salary");
        Scanner scanner = new Scanner(System.in);
        int base_salary = scanner.nextInt();
        System.out.println("Please enter total hours per week");
        int total_hours_week = scanner.nextInt();
        System.out.println("Please enter total hours per weekend");
        int total_hours_weekend = scanner.nextInt();
        double salary=0;
        scanner.close();
        if(base_salary < 1000){
            System.out.println("Please check base salary, it should be more than 1000 euros");
        }
        else {
            double base_salary_per_hour = (base_salary /40);

            if(total_hours_week < 40){
                // double salary= base_salary-((40- total_hours_week)*base_salary_per_hour);
                salary = base_salary_per_hour * total_hours_week;
                if(total_hours_weekend>0){
                    salary= salary + (total_hours_weekend*2*base_salary_per_hour);
                }
            }
            else{
                salary = base_salary+((total_hours_week -40)*(base_salary_per_hour)*1.5);
                if(total_hours_weekend>0){
                    salary = salary+(base_salary_per_hour*total_hours_weekend*2);
                    if((total_hours_week>=40) && (total_hours_weekend>=10)){
                        salary = salary + 500;

                    }
                }

            }
            System.out.println("your salary per week is "+salary);

        }
        return salary;
    }
}
