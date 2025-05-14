package ch16.exercise.p07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrWin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 최대값 얻기
        int max = maxOrWin(
                (x, y) -> x > y ? x : y
        );
        System.out.println("max = " + max);

        // 최소값 얻기
        int min = maxOrWin(
                (x, y) -> x < y ? x : y
        );
        System.out.println("min = " + min);
    }
}
