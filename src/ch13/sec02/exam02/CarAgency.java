package ch13.sec02.exam02;

public class CarAgency implements Rentabled<Car> {
    @Override
    public Car rent() {
        return new Car();
    }

}
