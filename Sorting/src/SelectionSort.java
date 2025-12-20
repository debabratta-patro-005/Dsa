import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        //Selection sort
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array to be sorted");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap min value
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
}
