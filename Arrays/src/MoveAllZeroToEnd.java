
import java.util.Scanner;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        System.out.println("Sorting array using logic 1");
        moveZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sorting array using logic 2");
        moveZeros2(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    // logic one to solve the problem
    public static void moveZeros(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == 0 && arr[end] != 0) {
                //swap
                swap(arr, start, end);
            } else {
                if (arr[start] != 0) {
                    start++;
                }
                if ( arr[end] == 0) {
                    end--;
                }
            }
        }
    }

    //logic 2 to sole the problem
    public static void moveZeros2(int[] arr) {
        int start = 0;
        int end = 1;
        while (start < arr.length && end < arr.length) {
            if (arr[start] == 0  && arr[end] != 0) {
                //swap
                swap(arr, start, end);
                start++;
                end++;
            }
            else {
                if (arr[start] != 0) {
                    start ++;
                }
                end++;
            }
        }
    }


    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
