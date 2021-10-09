package week3;
import java.util.ArrayList;
import java.util.List;


public class Course {
    public String name;
    public int credit;
    public int studentCount;
    private Teacher teacher;
    ArrayList<Integer> studentList = new ArrayList();
    public int maxStudentNumber=20;



    public Course(int studentCount, String name, int credit){
        this.name = name;
        this.credit = credit;

    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit (int credit) {
        this.credit = credit;
    }

    public int getStudentCount() {
        return this.studentList.size();
    }
    public void CheckStudent(Integer newStudent){
        int i;
        for(i = 0; i<studentList.size(); i++)
        {

            if(studentList.size()>maxStudentNumber)
            {
                System.out.println("A course can take 20 students max!");

            }
            else
            {
                this.studentList.add(newStudent);

            }

        }

    }

    public Teacher getTeacher () {
        return teacher;
    }

    public void setTeacher (Teacher teacher) {
        if (this.teacher != null){
            System.out.println("This course has already a teacher!") ;
        }
        this.teacher = teacher;
    }

}