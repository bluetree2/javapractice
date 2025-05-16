package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //K는 tv로 대체, M은 String로 대체
        Product<TV, String> product1 = new Product<>();

        //Setter 매개값은 반드시 Tv와 String를 제ㅐ공
        product1.setKind(new TV());
        product1.setModel("스마트 TV");

        //Getter 리턴값은 Tv와 String이 됨
        TV tv = product1.getKind();
        String model = product1.getModel();
        //-------------------------------------------
        // K는 Car로 대체, M은 String로 대체
        Product<Car, String> product2 = new Product<>();

        //Setter 매개값은 반드시 Car의 String을 제공
        product2.setKind(new Car());
        product2.setModel("Suv 자동차");

        // Getter 리턴값은 Car와 String이 됨
        Car car = product2.getKind();
        String model2 = product2.getModel();

    }
}
