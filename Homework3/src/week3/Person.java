package week3;

public class Person {
    public String name;
    public String surname;
    public int age;
    public char gender;

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void ShowPersonInfos(){
        System.out.println("Name:"+this.name);
        System.out.println("Surname:"+this.surname);
        System.out.println("Age:"+this.age);
        System.out.println("Gender:"+this.gender);

    }
}
