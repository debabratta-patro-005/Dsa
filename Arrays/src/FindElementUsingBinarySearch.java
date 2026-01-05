
//perform binary search on the sorted array to find the target value
// if value found print the value with index
//if not found print value not found

import java.util.Scanner;

public class FindElementUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        binarySearch(arr, x);
        sc.close();

    }

    public  static  void binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println(arr[mid] + " found at position " + (mid+1));
                return;
            } else  if (arr[mid] > key) {
                high = mid - 1;
            } else  {
                low = mid + 1;
            }
        }
    }
}
