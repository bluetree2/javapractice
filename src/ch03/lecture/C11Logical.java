package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리 연산자
        // and &&, &

        // or ||, |

        // 연산결과는 boolean
        // 피연산자는 boolean

        // and &&
        // : 두 피연산자가 true일 때만 결과 true, 나머지 결과 false

        System.out.println("true && true : " + (true && true)); // true
        System.out.println("true && false : " + (true && false)); // false
        System.out.println("false && true : " + (false && true)); // false
        System.out.println("false && false : " + (false && false)); // false

        // or ||
        // System.out.println(0 && true); // false
        // System.out.println(0 && false); // false
        // System.out.println(1 && true); // true
        // System.out.println(1 && false); // false

        // or ||, |
        // 두 피연산자가 false일 때만 결과 false, 나머지 결과 true

        System.out.println("true || true : " + (true || true)); // true
        System.out.println("true || false : " + (true || false)); // true
        System.out.println("false || true : " + (false || true)); // true
        System.out.println("false || false : " + (false || false)); // false

        System.out.println("true | true : " + (true | true)); // true
        System.out.println("true | false : " + (true | false)); // true
        System.out.println("false | true : " + (false | true)); // true
        System.out.println("false | false : " + (false | false)); // false

        // 연습
        int x = 5;
        int y = -8;
        boolean r1 = (x > 3) && (y < 8);  // true && false -> false
        System.out.println("r1 : " + r1);

        boolean r2 = (x > 3) || (y < 8); // true || false -> true
        System.out.println("r2 : " + r2);
        
        

        
        
    }
}
