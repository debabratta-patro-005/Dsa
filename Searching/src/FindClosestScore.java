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

    public static Short closestScore(short[] scores, int targetScore) {
        int diff = Integer.MAX_VALUE;
        short score = -1;
        for(int i = 0; i < scores.length; i++) {
            if (Math.abs(scores[i] -  targetScore) < diff) {
                diff = Math.abs(scores[i] - targetScore);
                score = scores[i];
            }
        }
        return  score;
    }

}
