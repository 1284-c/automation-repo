package week2;

import java.util.Random;

public class Dice_Gambling_Game {

    public static void main(String[] args){
        int total_wined_price=0;
        Random random = new Random();
        int die = random.nextInt(6) + 1;
        System.out.println("You roll a:" +die);
        while(die>2 && total_wined_price<=50){
            if(die==3){
                total_wined_price=total_wined_price;
                System.out.println("You haven't earned any money" );
                die= random.nextInt(6) + 1;
                System.out.println("You roll a:" +die);

            }
            else if (die==4){
                total_wined_price= total_wined_price+4;
                System.out.println("You win 4 dolars");
                die= random.nextInt(6) + 1;
                System.out.println("You roll a:" +die);

            }
            else if (die==5){
                total_wined_price= total_wined_price+5;
                System.out.println("You win 5 dolars");
                die= random.nextInt(6) + 1;
                System.out.println("You roll a:" +die);

            }
            else if (die==6){
                total_wined_price= total_wined_price+6;
                System.out.println("You win 6 dolars");
                die= random.nextInt(6) + 1;
                System.out.println("You roll a:" +die);

            }


        }
        if(total_wined_price>=50){
            System.out.println("You win in total :" +total_wined_price);
            System.out.println("You have earned the maximum amount of money you can earn");
        }
        else{
            System.out.println("You win in total :" +total_wined_price);
            System.out.println("Game Over..");
        }

    }

}
