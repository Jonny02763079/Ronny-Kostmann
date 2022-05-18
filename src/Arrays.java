public class Arrays {
    public static void main(String[] args) {

        int temp = 0;

        int[] numbers = {0,5,2,6,7,8,9,4,5,1};

        for (int i = 0; i < numbers.length; i++) {
            temp = temp + numbers[i];

        }
        System.out.println(temp);
    }
}
