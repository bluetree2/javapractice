package ch01.lecture;

public class C02print {

    public static void main(String[] args) {

        //출력
        System.out.println("출력 메시지");

        // sout : System.out.println 단축키
        System.out.println("또다른 출력");

        // shift enter : 다음 줄에 작성
        System.out.println("다시 출력");

        //print : 출력 후 줄바꿈 없음
        System.out.print("줄바꿈 없는 출력");
        System.out.print("줄바꿈 없는 출력");
        System.out.println("끝에 엔터");
        System.out.println("끝에 엔터 한번더");

        //printf : 특정 위치에 값 포함 출력 
        System.out.printf("값 포함 출력 %d", 10);

        //  \n : 줄바꿈
        System.out.println("\n줄바꿈");
        System.out.println("줄바꿈\n줄바꿈");

        System.out.printf("값%s값%s \n", "a", "b");
        System.out.println("12345678 \n");
        // %숫자s : 최소 너비 지정
        System.out.printf("값%3s값%3s \n", "a", "b");
        // %-숫자s : 최소 너비 지정 후 왼쪽 정렬
        System.out.printf("값%-3s값%-3s \n", "a", "b");
        //%d : 정수형 출력
        System.out.printf("%s%d\n","hi",987);
        //%f : 실수형 출력
        System.out.printf("%s%d%f\n","hello",99, 3.14);
        //%10.3 : 총 10자리, 소수점 이하 3wkfl
        System.out.printf("%10.3");



        
        
        
        
        
        
        
        

        //  \t : 탭
        System.out.println("탭\t탭");
        
        

        


    }
}
