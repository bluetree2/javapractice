package ch03.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
