import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {


        boolean isFinished = false;

        int balance = 0;
        int amount = 0;

        String ID0 = "hund";
        String ID1 = "Affe";

        System.out.println("Geben sie ihr Passwort ein");

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.next();

        if (selection.equals(ID0) || selection.equals(ID1)) {



            while (!isFinished) {

                printMenu();
                int functionSelection = scanner.nextInt();


                if (functionSelection == 1) {
                    System.out.println("Wie viel Geld wollen sie einzahlen");
                    amount = scanner.nextInt();
                    balance = balance + amount;
                    System.out.println("Sie haben " + amount + " Euro eingezahlt");

                } else if (functionSelection == 2) {
                    System.out.println("Wie viel Geld wollen sie abheben");
                    amount = scanner.nextInt();
                    if (balance <= amount) {
                        System.out.println("Sie besitzen zu wenig Geld");
                    } else {
                        System.out.println("Sie haben " + amount + " Euro abgehoben");
                        balance = balance - amount;
                    }

                } else if (functionSelection == 3) {
                    System.out.println("Ihr Kontostand beträgt " + balance + " Euro");

                } else if (functionSelection == 4) {
                    System.out.println("Kontoeinzug Beendet");
                    isFinished = true;
                    break;
                }

            }
        } else {
            System.out.println("Passwort falsch");
            return;
        }
    }

    public static void printMenu() {
        System.out.println("1 Einzahlen");
        System.out.println("2 Abheben");
        System.out.println("3 Kontostand");
        System.out.println("4 Zahlung Beenden");
    }
}