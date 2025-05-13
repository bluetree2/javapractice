package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicaAirplane sa = new SupersonicaAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicaAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicaAirplane.NORMAL;
        sa.fly();
        sa.land();
        
    }
}
