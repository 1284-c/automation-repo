package week4;

import java.util.Scanner;

public class UserUpdate {
    private User validUser;

    public void UserChange() {

        Scanner scan = new Scanner(System.in);
        String change = scan.nextLine();
        validUser = new User("","","","");
        System.out.println("New username : ");
        this.validUser.setUsername(change);
        System.out.println("New phonenumber : ");
        this.validUser.setPhone(change);
        System.out.println("New address: ");
        this.validUser.setAddress(change);
        System.out.println("Profile updated....");

    }
}
