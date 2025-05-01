package ch04.exercise;

public class exercise04 {
    public static void main(String[] args) {
        //while , random 활용
        // 눈의 합이 5명 계속 주사위를 던지고
        // 5면 실행을 멈춤

        int dice1;
        int dice2;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("dice1 = " + dice1);
            System.out.println("dice2 = " + dice2);
            System.out.println("두 주사위의 합 : " + (dice1 + dice2));
        } while (!(dice1 + dice2 == 5));
        System.out.println("완료");

    }
}
