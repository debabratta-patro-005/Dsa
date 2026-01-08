import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names seperated by spaces: ");
        String[] str = sc.nextLine().split(" ");
        for(int i = 0; i < str.length-1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
