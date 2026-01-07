import java.util.Scanner;

public class FindClosestScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of student scores
        int n = sc.nextInt();
        short[] scores = new short[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextShort();
        }
        // Target score to compare
        short targetScore = sc.nextShort();

        // write your code here
        Short score = closestScore(scores, targetScore);
        System.out.println(" output: " + score);
    }

    public static short closestScore(short[] scores, int targetScore) {
        int minDiff = Integer.MAX_VALUE;
        short closest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            int diff = Math.abs(scores[i] - targetScore);

            if (diff < minDiff) {
                minDiff = diff;
                closest = scores[i];
            }
            else if (diff == minDiff && scores[i] < closest) {
                closest = scores[i];
            }
        }

        return closest;
    }


}
