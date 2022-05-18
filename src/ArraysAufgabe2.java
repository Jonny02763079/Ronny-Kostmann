import java.util.Random;

public class ArraysAufgabe2 {

    public static void main(String[] args) {

        int[] random = new int[50];
        Random number = new Random();
        int temp = 0;
        for (int i = 0; i < random.length; i++) {
            random[i] = number.nextInt(0 + 100);
            temp = temp + random[i];
            System.out.println("Die Zahl " + random[i] + " wurde generiert");
            System.out.println("Die Summe beträgt nun " + temp);
        }


    }
}
