package ch06.exercise.p15;

public class main {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        boolean result = service.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다");
            service.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다");
        }
    }
}
