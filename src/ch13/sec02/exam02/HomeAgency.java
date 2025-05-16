package ch13.sec02.exam02;

public class HomeAgency implements Rentabled<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
