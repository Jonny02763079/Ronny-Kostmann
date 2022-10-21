public class ArrayAufgabe1 {
    public static void main(String[] args) {
        int data[] = new int[] {1,11,2,22,3,33,4,44,5,55};
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum+=data[i];

        }
        System.out.println("Array Sum = " + sum);
    }
}

