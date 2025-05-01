package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
        */
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        /*
        0
        1   
        2
        3
        4
        */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        // 0 2 4 6 8
        // 2 4 6 8 10
        // 4 3 2 1 0 
        // 5 4 3 2 1 
        // * * * * * 

       /*  int a = 0;
        int b = 2;
        int c = 4;
        int d = 5;
       for (int i = 0; i < 5; i++) {
        System.out.print(a+" ");
        a+=2;
       }
       System.out.println();
       for (int i = 0; i < 5; i++) {
        System.out.print(b+" ");
        b+=2;
       }
       System.out.println();
       for (int i = 0; i < 5; i++) {
        System.out.print(c+" ");
        c--;
       }
       System.out.println();
       for (int i = 0; i < 5; i++) {
        System.out.print(d+" ");
        d--;
       }
       System.out.println();
       for (int i = 0; i < 5; i++) {
        System.out.print("* ");
       } */

        for(int i = 0; i < 10; i+=2){
            System.out.print(i+" ");   
        }
        System.out.println();
        for(int i = 2; i < 11; i+=2){
            System.out.print(i+" ");   
        }
        System.out.println();
        for(int i = 4; i > -1; i--){
            System.out.print(i+" ");   
        }
        System.out.println();
        for(int i = 5; i > 0; i--){
            System.out.print(i+" ");   
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.print("* ");   
        }
        
        System.out.println();
        System.out.println("--------------------------------");
        /*
        *****
        *****
        *****
        *****
        *****
        */
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
    }
}
