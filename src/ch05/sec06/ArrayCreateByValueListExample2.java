package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // 배열을 매개값으로 주고, printItem 메소드 호출
        printItem(new int[]{83, 90, 87});

    }

    // printItem 메소드 선언
    public static void printItem(int[] scores) {
        // 매개변수가 참조하는 배열의 길이만큼 반복
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}
