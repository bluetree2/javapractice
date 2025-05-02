package ch05.exercise;

public class exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("max = " + max);

        int max2 = array[0];
        for (int i : array) if (i > max2) max2 = i;
        System.out.println("max2 = " + max2);

        

    }
}

