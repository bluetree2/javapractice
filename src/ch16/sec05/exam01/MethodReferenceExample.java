package ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메소드일 경우
        // 람다식
        // person.action(x,y) -> Computer.static(Method(x,y);
        // 메소드 참조
        person.action(Computer::staticmethod);

        // 인스턴스 메소드일 경우
        Computer com = new Computer();
        // 람다식
        person.action((x, y) -> com.instancemethod(x, y));
        // 메소드 참조
        person.action(com::instancemethod);
    }
}
