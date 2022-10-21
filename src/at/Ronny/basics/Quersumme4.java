package at.Ronny.basics;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Quersumme4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        int input = 0;

        System.out.println("Geben sie eine Zahl ein");

        while(error) {
            try {
                input = scanner.nextInt();
                scanner.nextLine();
                error = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Bitte keine Kommastellen oder zu hohen Zahlen");
            }
        }

        int initial = input;

        while (input > 9){
            int tmp = input;
            input = 0;
            while (tmp > 0) {
                input += tmp % 10;
                tmp /= 10;
            }
        }

        System.out.println("Die Ziffernwurzel von " + initial + " ist " + input);


    }
}