import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        System.out.println("select your month");
        Scanner month = new Scanner(System.in);
        String monthname = month.next();
        System.out.println("select your month start day");
        Scanner monthstart = new Scanner(System.in);
        int montnstartday = monthstart.nextInt();

        switch (monthname) {
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember":
                System.out.println(monthname + " hat 31 Tage");
                for (int i = 0; i < 31; i++) {

                }

                break;

            case "Februar", "April", "Juni", "September", "November":
                System.out.println(monthname + " hat 30 Tage");
                break;

            default:
                System.out.println("Bitte geben sie ihren Gewünschten Monat ein");
                break;
        }
        ;

    }
}
