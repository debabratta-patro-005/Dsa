import java.util.Scanner;

public class SubArraysWithK_oddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k");
        int k = sc.nextInt();
        int odd_c = 0;
        for (int i = 0; i < n-k; i++) {
            int c = 0;
            int j = i;
            while(c != k && j < n){
                if(arr[j] % 2 == 1) {
                    c++;
                }
                j++;
            }
            if(c == k){
                odd_c++;
            }
        }
        System.out.println("Odd count sub array: " + odd_c);

    }

}
