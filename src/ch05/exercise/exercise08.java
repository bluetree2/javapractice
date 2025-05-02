package ch05.exercise;

public class exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//            cnt += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                cnt++;
            }
        }
        double avg = (double) sum / cnt;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
}
