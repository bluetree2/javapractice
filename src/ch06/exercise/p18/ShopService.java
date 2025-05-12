package ch06.exercise.p18;

public class ShopService {
    // private 접근 권한을 갖는 정적 핑드 선언과 초기화
    private static final ShopService Shop = new ShopService();

    // private 접근 권한을 갖는 생성자 선언
    private ShopService() {

    }

    // public 접근 권한을 갖는 정적 메소드 선언
    public static ShopService getInstance() {
        return Shop;
    }
}
