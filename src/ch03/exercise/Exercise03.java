package ch03.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        //학생 한 병이 가지는 연필 수
        int pencilsPerStudents = pencils / students;
        System.out.println("pencilsPerStudents = " + pencilsPerStudents);

        int pencilsLeft = pencils % students;
        System.out.println("pencilsLeft = " + pencilsLeft);
    }
}
