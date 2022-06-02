import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 1000;
        int min = 0;

        int value = random.nextInt(max + min) + min;
        System.out.println(value);

        int value2 = random.nextInt(max + min) + min;
        System.out.println(value2);


            if (value > value2) {
                for (int i = value; i > value2; i--) {
                    System.out.println(i);
                }
            } else if (value >= value2) {
                System.out.println(value);
            } else {
                for (int i = value2; i > value; i--) {
                    System.out.println(i);
                }
                ;
            }
        }
    }

