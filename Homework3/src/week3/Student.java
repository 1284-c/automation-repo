package week3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    public int year;
    public int maxcredit=20;
    ArrayList<Integer> credits = new ArrayList();

    public Student(String name, String surname, int age, char gender,int year) {
        super(name, surname, age, gender);
        this.year= year;

    }
    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void CheckCredit(Integer newCredit){
        int i;
        int totalCredit=0;
        for(i = 0; i<credits.size(); i++)
        {
            totalCredit= totalCredit+credits.get(i);
            if(totalCredit>maxcredit)
            {
                System.out.println("You can take 20 credits max!");

        }
            else
            {
                this.credits.add(newCredit);

            }

    }

}
}
