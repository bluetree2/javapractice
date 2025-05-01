package ch04.exercise;

public class exercise05_2 {
    public static void main(String[] args) {
        while (true) {
            int i = (int) (Math.random() * 10) + 1;
            int j = (int) (Math.random() * 10) + 1;
            if (((4 * i) + (5 * j)) == 60) {
                System.out.println("성공 : " + i + ", " + j);
                break;
            }
            System.out.println("실패 : " + i + ", " + j);
        }
    }
}
