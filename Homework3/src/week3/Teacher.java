package week3;


import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Person {
    public int maxcoursenumber=3;
    ArrayList<Integer> courses = new ArrayList();


    public Teacher(String name, String surname, int age, char gender) {
        super(name, surname, age, gender);
    }
    public void CheckCourse(Integer newCourse){
        int i;

        for(i = 0; i<courses.size(); i++)
        {

            if(courses.size()>maxcoursenumber)
            {
                System.out.println("Teacher can give 3 courses max!");

            }
            else
            {
                this.courses.add(newCourse);

            }

        }

    }


}
