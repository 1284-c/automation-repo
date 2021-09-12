package week2;

public class Employee {
    public int years;
    public void raise_amount() {

        if(years<1){
            System.out.println("No raise is made ");
        }
        else{
            if(years==1){
                System.out.println("Your raise %5 ");
            }
            else if(years==2){
                System.out.println("Your raise %10 ");
            }
            else if(years==3){
                System.out.println("Your raise %15 ");
            }
            else if(years==4){
                System.out.println("Your raise %20 ");
            }
            else {
                System.out.println("Your raise %25 ");
            }
        }

    }
}
