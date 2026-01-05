import java.util.Scanner;

public class FindMaximumMeeting {
        public static int maxMeetings(int[] start, int[] end) {

            // Your code here
            int count = 0;
            for (int i = 0; i < start.length-1; i++) {
                for (int j = i+1; j < end.length; j++) {
                    if (end[i] > end[j]) {
                        //swap both start and end
                        swap(start, i, j);
                        swap(end, i, j);
                    }
                }
            }
//            int startTime = 0;
            int endTime = -1;
            for (int i = 0; i < start.length; i++) {
                if (endTime < start[i]) {
                    count++;
                    endTime = end[i];
                }
            }


            return count;

        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int[] start = new int[n];

            int[] end = new int[n];

            for (int i = 0; i < n; i++) {

                start[i] = scanner.nextInt();

            }

            for (int i = 0; i < n; i++) {

                end[i] = scanner.nextInt();

            }

            System.out.println(maxMeetings(start, end));

            scanner.close();

        }

    }