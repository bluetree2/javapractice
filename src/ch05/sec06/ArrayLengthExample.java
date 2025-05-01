package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        // 배열 변수의 선언과 배열 생성
        int[] scores = {83, 90, 87};

        // 배열 항목의 총합 구하기
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        // 배열 항목의 평균 구하기 
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);

        // 배열 항목의 최대값 구하기
        int max = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }
        
    }
}
