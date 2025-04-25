import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {
        int[] number = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            number[i] = rand.nextInt(100);
            System.out.println(number[i] + " ");
        }

        int max = number[0];
        int min = number[0];

        for (int i = 1; i < 10; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        for (int i = 1; i < 10; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}