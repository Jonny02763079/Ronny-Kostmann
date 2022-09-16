import java.util.Random;

public class Quersumme3 {
    public static int[] CrossSums = new int[CrossSumCalculation(false) + 1];

    public static void main(String[] args) {
        //Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.

        CrossSumCalculation(true);
        int biggesCrossSum = 0;
        int biggestCrossSum2 = 0;
        int biggestEmergence = 0;

        for (int i = 0; i < CrossSums.length; i++){
            if (CrossSums[i] == biggestEmergence)
                biggestCrossSum2 = i;
            if (CrossSums[i] > biggestEmergence) {
                biggesCrossSum = i;
                biggestEmergence = CrossSums[i];
            }
            //System.out.println(i + ": " + CrossSums[i]);
        }

        System.out.println();
        if (biggesCrossSum == biggestCrossSum2 || biggestCrossSum2 == 0)
            System.out.println("Biggest Cross Sum: " + biggesCrossSum);
        else
            System.out.println("Biggest Cross Sums: " + biggesCrossSum + ", " + biggestCrossSum2);
        System.out.println("Biggest Emergence: " + biggestEmergence);
    }

    public static int CrossSumCalculation(boolean secondTry){
        int biggestcrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if(crossSum > biggestcrossSum) biggestcrossSum = crossSum;
            if(secondTry) CrossSums[crossSum]++;
        }
        return biggestcrossSum;
    }
}

