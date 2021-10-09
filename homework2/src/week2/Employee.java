package week2;

public class Employee {
    public int years;
    public void raise_amount() {
    Weekly_Salary_Calculation  weekly_salary_calculation =new Weekly_Salary_Calculation();
    double salary= weekly_salary_calculation.salary_calculation();

        if(years<1){
            System.out.println("No raise is made ");
            salary=salary;
        }
        else{
            if(years==1){
                salary=salary+ (salary*5)/100;
                System.out.println("Your raise %5 "+salary);
            }
            else if(years==2){
                salary=salary+ (salary*10)/100;
                System.out.println("Your raise %10 "+salary);


            }
            else if(years==3){
                salary=salary+ (salary*15)/100;
                System.out.println("Your raise %15 "+salary);

            }
            else if(years==4){
                salary=salary+ (salary*20)/100;
                System.out.println("Your raise %20 "+salary);


            }
            else {
                salary=salary+ (salary*25)/100;
                System.out.println("Your raise %25 "+salary);


            }
        }

    }
}
