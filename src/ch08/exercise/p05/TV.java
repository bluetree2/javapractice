package ch08.exercise.p05;

public class TV implements Remocon {
    public static void main(String[] args) {
        Remocon tv = new TV();
        tv.powerOn();
    }

    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }
}
