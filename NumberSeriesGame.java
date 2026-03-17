import java.util.Scanner;

public class NumberSeriesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        int[][] series = {
            {2, 4, 6, 8, 10},
            {3, 6, 9, 12, 15},
            {5, 10, 15, 20, 25}
        };

        System.out.println("=== NUMBER SERIES GAME ===");
        System.out.println("Find the next number in the series\n");

        for (int i = 0; i < series.length; i++) {
            System.out.println("Question " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print(series[i][j] + " ");
            }
            System.out.println("?");

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (answer == series[i][4]) {
                System.out.println("Correct Answer!\n");
                score += 10;
            } else {
                System.out.println("Wrong Answer! Correct answer is " + series[i][4] + "\n");
            }
        }

        System.out.println("Game Over");
        System.out.println("Your Score: " + score);

        sc.close();
    }
}