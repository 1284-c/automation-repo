package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String username ;
    public static String password ;
    public static String phone ;
    public static String address ;

    public static void main(String[] args) {

        login();


    }

    public static void login() {
        List<User> user = new ArrayList<>();
        user.add(new User("ahmet","1234","05552909999","İstanbul/Avcılar"));
        user.add(new User("mehmet","1234+","05552909998","Kocaeli/Gebze"));
        user.add(new User("ayse","02121682898+","12345","KKonya / Meram"));
        user.add(new User("fatma","A12345++","01111111111","KKonya / Meram"));
        user.add(new User("hayriye","1234+","09999999999","Samsun /Çarşamba"));

        LandingPage landingPage = null;

        System.out.println("Please enter username: ");
        Scanner name = new Scanner(System.in);
        username = name.next();

        System.out.println("Please enter password: ");
        Scanner passwordd = new Scanner(System.in);
        password = passwordd.next();

        for (User userr : user) {
            if (userr.getUsername().equals(username)&&userr.getPassword().equals(password)) {
               System.out.println("WELCOME TO APP");
               landingPage.SelectPage();

            }
            else{
                System.out.println("User is not verified to app");
                break;

            }
        }
    }

}
