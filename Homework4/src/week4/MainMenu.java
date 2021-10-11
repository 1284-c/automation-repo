package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public void MainMenuPage() {
        Search search = null;
        Basket basket = null;
        LandingPage landingPage =null;
        System.out.println("1 - Product Search");
        System.out.println("5 - Basket");
        System.out.println("3 - LandingPage");
        Scanner scan1 = new Scanner(System.in);
        int selectNavigate  = scan1.nextInt();
        switch (selectNavigate){
            case(1):{
                search.SearchPage();

            }
            case(2):{
                basket.BasketPage();

            }
            case(3):{
                landingPage.SelectPage();
            }
        }

       System.out.println("Categories:");
       System.out.println("1-FruitandVegetable:");
       System.out.println("2-Snack:");
       System.out.println("3-Breakfast:");
       Scanner scan = new Scanner(System.in);
       int selectcategory    = scan.nextInt();
          if(selectcategory==1){
              System.out.println("1-Fruit");
              System.out.println("2-Vegetabele");
              Scanner scan2 = new Scanner(System.in);
              int selectSubcategory = scan2.nextInt();
              if(selectSubcategory==1){
                  List fruit= new ArrayList();
                  fruit.add("Apple");
                  fruit.add("Pear");
                  fruit.add("Grape");
                  System.out.println(fruit);


              }
              else{
                  List vegatble= new ArrayList();
                  vegatble.add("Tomatto");
                  vegatble.add("Pepper");
                  vegatble.add("Eggplamt");
                  System.out.println(vegatble);

              }


          }
          else if (selectcategory==2){
              System.out.println("* Chips");
              System.out.println("* Choclate");
              Scanner scan2 = new Scanner(System.in);
              int selectSubcategory = scan2.nextInt();
              if(selectSubcategory==1){
                  List Chips= new ArrayList();
                  Chips.add("Lays");
                  Chips.add("Doritos");
                  Chips.add("Ruffles");
                  System.out.println(Chips);

              }
              else{
                  List Chocalta= new ArrayList();
                  Chocalta.add("Tadelle");
                  Chocalta.add("Albeni");
                  Chocalta.add("Metro");
                  Chocalta.add("Hobby");
                  System.out.println(Chocalta);

              }


          }
          else
              System.out.println("* Milk");
              System.out.println("* Delicatessen");
            Scanner scan2 = new Scanner(System.in);
            int selectSubcategory = scan2.nextInt();
            if(selectSubcategory==1){
                List Milk= new ArrayList();
                Milk.add("Full-fat");
                Milk.add("Low-fat");
                Milk.add("Lacto-free");
                System.out.println(Milk);

            }
            else{
                List Delicatessen= new ArrayList();
                Delicatessen.add("Cheddar");
                Delicatessen.add("Cheese");
                Delicatessen.add("Salami");
                Delicatessen.add("Sausage");
                Delicatessen.add("Olive");
                System.out.println(Delicatessen);

            }


    }
}
