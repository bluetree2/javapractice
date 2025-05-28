package etc.lecture.p02enum;

// enum : 값들을 나열한 타입
enum Animals {
    TIGER, LION, EAGLE, BULL;
}

//enum 없이

public class App01 {
    public static void main(String[] args) {
        var val1 = Values.TIGER;
        var val2 = Values.LION;
        var val3 = Values.EAGLE;
        var val4 = Values.BULL;

        Animals animal1 = Animals.LION;
        Animals animal2 = Animals.EAGLE;
        Animals animal3 = Animals.BULL;

        var val5 = Animals.TIGER;

        System.out.println(animal1.name());
        System.out.println(animal2.name());

        System.out.println(animal3.ordinal());
        System.out.println(val5.ordinal());

        String s1 = "TIGER";
        Animals v6 = Animals.valueOf(s1);
        System.out.println("v6 = " + v6);
        System.out.println(v6 == Animals.TIGER);


    }
}

class Values {
    public static final int TIGER = 1;
    public static final int LION = 2;
    public static final int EAGLE = 3;
    public static final int BULL = 4;
}