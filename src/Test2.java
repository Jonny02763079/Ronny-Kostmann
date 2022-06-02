import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        while (true) {



            int max = 10;
            int min = 0;

            int value = random.nextInt(max + min) + min;

            sum = sum + value;


            if (value == 5) {
                System.out.println(sum);
                break;

            }
            ;
        }
    }
}
