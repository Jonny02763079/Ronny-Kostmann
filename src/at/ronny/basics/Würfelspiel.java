package at.ronny.basics;

import java.util.Random;
import java.util.Scanner;


public class Würfelspiel {

    public static void main(String[] args) {


        System.out.println("Press p to play");

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.next();


        int player = 0;
        int computer = 0;
        String IdStart = "p";


        if (selection.equals(IdStart)) {


            int trys = 5;
            int playerbalance = 0;
            int computerbalance =0;

            while (trys >= 0) {


                trys = trys - 1;

                int min = 1;
                int max = 5;

                Random random = new Random();

                System.out.println("Spieler würfelt");

                int value = random.nextInt(max + min) + min;
                System.out.println(value);

                playerbalance = playerbalance + value;

                System.out.println("Computer würfelt");

                int valueComputer = random.nextInt(max + min) + min;
                System.out.println(valueComputer);

                computerbalance = computerbalance + valueComputer;


            }
            if(playerbalance > computerbalance){
                System.out.println("Sie haben gewonnen mit einer Gesammtsumme von " + playerbalance);
                System.out.println("Der Computer hat " + computerbalance);
            } else if (computerbalance > playerbalance){
                System.out.println("Der Computer hat gewonnen mit einer Gesammtsumme von " + computerbalance);
                System.out.println("Sie haben " + playerbalance);
            } else if (playerbalance == computerbalance){
                System.out.println("Es ist unentschieden, sie haben beide eine Gesammtsumme von " + playerbalance);
            }
        }
    }
}
