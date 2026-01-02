
/*

Find the highest nearest value i.e. less than or equals to the threshold value
if no value exists print no value found

 */


import java.util.Scanner;

public class FindNearestValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float[] balance = new float[n];

        for (int i = 0; i < n; i++) {

            balance[i] = sc.nextFloat();

        }

        float threshholdBalance = sc.nextFloat();


        float highestVal = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {

            if (balance[i] <= threshholdBalance && balance[i] > highestVal) {

                highestVal = balance[i];

            }

        }

        if (highestVal != Integer.MIN_VALUE) {

            System.out.println(highestVal);

        } else {

            System.out.println("not found");

        }
    }
}
