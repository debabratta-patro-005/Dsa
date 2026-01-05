
import java.util.Scanner;

public class FindNearestTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the min temperature");
        int min = sc.nextInt();
        System.out.println("Enter the max temperature");
        int max = sc.nextInt();
        System.out.println("Enter the nearest temperature which you want to find");
        int value = sc.nextInt();
        findNearestTemp(arr, min, max, value);
    }

    public static void findNearestTemp(int[] arr, float min, float max, int value) {
        float temp = 0;
        boolean found = false;
        float min_diff = Float.MAX_VALUE;
        float difference;
        for (float j : arr) {
            if (j >= min && j <= max) {
                difference = Math.abs(j - value);
                if (difference < min_diff || (min_diff == difference && j < value)) {
                    min_diff = difference;
                    temp = j;
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("The temperature is not in the array");
        }
        else {
            System.out.println("Temperature fount " + temp);
        }
    }
}
