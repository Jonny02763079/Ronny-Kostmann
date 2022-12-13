public class ArraysAufgabe3
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {8, 3, 2, 22, 8, 1};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}