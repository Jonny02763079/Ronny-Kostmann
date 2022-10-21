package at.Ronny.basics;

import java.util.Scanner;

public class Kalender {

    static Scanner scanner = new Scanner(System.in);
    static String monthname;
    static String ID0 = "start";
    static String ID1 = "finish";
    static int monthstartday;
    static boolean start = true;

    public static void main(String[] args) {


        if (start == true) {
            getstartet();
        }

    }

    public static void getstartet() {

        while (start == true) {

            System.out.println("select your month");
            monthname = scanner.next();
            System.out.println("select your month start day");
            monthstartday = scanner.nextInt();

            switch (monthname) {
                case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember":
                    System.out.println(monthname + " hat 31 Tage");

                    switch (monthstartday) {
                        case 1:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 1; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                    System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;

                            }
                            break;
                        case 2:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 2; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 3:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 3; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 4:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 4; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 5:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 5; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 6:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 6; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 7:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 7; j < 32; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;

                        default:
                            System.out.print("Bitte geben sie ihren Gewünschten Starttag zwischen 1 und 7 ein");
                            getstartet();


                    }


                    break;

                case "Februar", "April", "Juni", "September", "November":
                    System.out.println(monthname + " hat 30 Tage");
                    switch (monthstartday) {
                        case 1:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 1; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;

                            }
                            break;
                        case 2:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 2; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 3:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 3; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 4:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 4; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 5:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 5; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 6:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 6; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;
                        case 7:
                            System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                            for (int j = 7; j < 31; j++) {
                                if (j % 7 == 0) {
                                    if (j < 10){
                                        System.out.println("|" + j + " |");
                                    }
                                    else {
                                        System.out.println("|" + j + "|");
                                    };
                                }else {
                                    if (j < 10){
                                        System.out.print("|" + j + " |");
                                    }
                                    else {
                                        System.out.print("|" + j + "|");
                                    };
                                };
                                ;
                            }
                            break;

                        default:
                            System.out.println("Bitte geben sie ihren Gewünschten Starttag zwischen 1 und 7 ein");
                            getstartet();
                    }
                    break;


                default:
                    System.out.println("Bitte geben sie ihren Gewünschten Monat richtig ein");
                    getstartet();
            }
            ;
            System.out.print("\ngeben sie start ein um den nächsten Monat auszuwählen oder geben sie finish ein um das Programm zu beenden\n");
            String weiterbefehl = scanner.next();
            if (weiterbefehl.equals(ID0)) {
                getstartet();
            } else if (weiterbefehl.equals(ID1)) {
                System.out.println("Das Programm ist beendet\n");
                start = false;
                return;
            } else {
                System.out.println("ungültige Eingabe\n");
                start = false;
                return;
            }
            ;


        }


    }

    ;
}

