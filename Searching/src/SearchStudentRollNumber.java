//You are given:
//        1. An integer n, representing the number of students.
//2. A sorted array of n integers, representing the roll numbers in ascending order.
//        3. An integer targetRollNumber, which is the roll number of the student being searched for.
//You need to:
//Perform a binary search on the sorted list of roll numbers to find targetRollNumber.
//        If found, print "Roll number found at position: x" (1-indexed).
//If not found, print "Roll number not found".
//Constraints:
//        1 <= n <= 1000
//        1 <= rollNumber, targetRollNumber <= 50,000

import java.util.Scanner;
public class SearchStudentRollNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of students
        int n = sc.nextInt();

        int[] rollNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();
        }

        // Target roll number to find
        int targetRollNumber = sc.nextInt();

        // write your code here
        int value = search(rollNumbers, targetRollNumber);
        if (value > -1) {
            System.out.println("Roll number found at position: " + value);
        } else {
            System.out.println("Roll number not found");
        }
    }

    public static int search(int[] rollNumbers, int targetRollNumber) {
        int start = 0;
        int end = rollNumbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (rollNumbers[mid] == targetRollNumber) {
                return mid+1;
            }
            if (rollNumbers[mid] < targetRollNumber) {
                start = mid + 1;
            }  else if (rollNumbers[mid] > targetRollNumber) {
                end = mid - 1;
            }
        }
            return -1;
    }

}
