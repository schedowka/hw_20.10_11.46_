import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] myArray = new double[n];
        for (int i = 0; i< myArray.length; i++) {
            myArray[i] = random.nextDouble() * 20 - 10;
        }


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = Math.abs(myArray[i]);

                System.out.println("отрицательные :" + myArray[i]);
            }

        }
        for (int i = 0; i< myArray.length; i++) {
            if (i % 2 != 0) {
                myArray[i] = Math.sqrt(myArray[i]);

                System.out.println("нечетные:" + myArray[i]);
            }
        }


    }
}