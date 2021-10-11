package week4;

import java.util.Scanner;

public class LandingPage {


    public void SelectPage() {
        MainMenu mainMenu = null;
        Search search = null;
        Profile profile = null;

        System.out.println("1 - Main Menu");
        System.out.println("2 - Search");
        System.out.println("3 - Profile");
        Scanner scan = new Scanner(System.in);
        int selectPage = scan.nextInt();
        switch (selectPage){
            case(1):{
                mainMenu.MainMenuPage();
                break;

            }
            case(2):{
                search.SearchPage();
                break;


            }
            case(3):{
                profile.ProfilePage();
                break;

            }
            default:
                SelectPage();

        }
    }

}
