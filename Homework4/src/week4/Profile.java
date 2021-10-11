package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profile {
    public void ProfilePage() {
        List<User> user = new ArrayList<>();
        LandingPage landingPage = null;
        UserUpdate userUpdate = null;
        user.add(new User("ahmet","1234","05552909999","İstanbul/Avcılar"));
        user.add(new User("mehmet","1234+","05552909998","Kocaeli/Gebze"));
        user.add(new User("ayse","02121682898+","12345","KKonya / Meram"));
        user.add(new User("fatma","A12345++","01111111111","KKonya / Meram"));
        user.add(new User("hayriye","1234+","09999999999","Samsun /Çarşamba"));

        System.out.println(" User Lists:");
        System.out.println(user);
        System.out.println("1 -Update profile");
        System.out.println("2 -Back to Landing Page");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();

        switch (select){
            case (1):
               userUpdate.UserChange();
                break;
            case (2) :
                landingPage.SelectPage();
                break;
            default:
                ProfilePage();
        }
    }
}
