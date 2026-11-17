import java.util.Arrays;

public class NativeArrays {
    public static void main(String[] args) {

        int[] scores = new int[5];

        System.out.println("Default integer: " + Arrays.toString(scores));

        int[] nums = {3, 7, 1, 9, 4};

        System.out.println("Initializer list: " + Arrays.toString(nums));

        String[] names = new String[3];
        boolean[] flags = new boolean[3];
        double[] prices = new double[3];

        System.out.println("Default string: " + Arrays.toString(names));
        System.out.println("Default boolean: " + Arrays.toString(flags));
        System.out.println("Default double: " + Arrays.toString(prices));

        nums[2] = 6;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(" index " + i + " -> value " + nums[i]);
        }

        for (int value : nums) {
            System.out.println(value);
        }

        int[] challengeOne = {3, 7, 1, 9, 4};
        for (int i = 0; i < challengeOne.length; i++) {
            challengeOne[i] *= 2;
        }
        System.out.println("New array: " + Arrays.toString(challengeOne));

        int[] challengeTwo = {3, 7, 1, 9, 4};
        for (int i = 0; i < challengeTwo.length; i+=2) {
            challengeTwo[i] += 10;
        }
        System.out.println("New array: " + Arrays.toString(challengeTwo));

        int[] temps = {5, -3, 8, -1, 0, -7};
        for (int i=0; i<temps.length; i++) {
            if (temps[i] < 0) {
                temps[i] = 0;
            }
        }
        System.out.println("New array: " + Arrays.toString(temps));


        int[] score = {85, 62, 97, 45, 70, 99};
        for (int i=0; i<score.length; i++) {
            score[i] += 5;
            if (score[i] > 100) {score[i]=100;}
        }
        System.out.println("New array: " + Arrays.toString(score));

        int[] num = new int[10];
        for (int i=0; i<10; i++) {
            int ri = (int)(Math.random() * 10);
            int rn = (int)(Math.random() * 101);
            num[ri] = rn;
        }
        System.out.println("New array: " + Arrays.toString(num));
    }
}