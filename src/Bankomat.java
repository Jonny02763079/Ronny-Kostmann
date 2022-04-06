import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {


        boolean end = false;
        int selecionkapital = 0;
        String ID0 = "hund";
        String ID1 = "Affe";

        System.out.println("Geben sie ihr Passwort ein");

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.next();

        if (selection.equals(ID0) || selection.equals(ID1)){

            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand");
            System.out.println("4 Zahlung Beenden");

            while (!end){


                int wahl = scanner.nextInt();
                int selectionstand = 0;
                int selectionkapital = 0;
                int selectionbetrag = 0;
                if(wahl == 1){
                    System.out.println("Wie viel Geld wollen sie einzahlen");
                    selectionkapital = scanner.nextInt();
                    System.out.println("Sie haben " + selectionkapital + " Euro eingezahlt");
                }
                if(wahl == 2){
                    System.out.println("Wie viel Geld wollen sie abheben");
                    selectionstand = scanner.nextInt();

                    System.out.println("Sie haben " + selectionstand + " Euro abgehoben");
                    if (selectionstand <= selectionkapital){
                        System.out.println("Sie besitzen zu wenig Geld");
                    }
                    else {
                        selectionbetrag = selectionkapital - selectionstand;
                    };
                }
                if(wahl == 3){
                    System.out.println("Ihr Kontostand beträgt " + selectionbetrag + " Euro");
                }
                if(wahl == 4){
                    System.out.println("Kontoeinzug Beendet");
                    end = true;
                    break;
                }

        }
    }else{
            System.out.println("Passwort falsch");
            return;
        }
}
}