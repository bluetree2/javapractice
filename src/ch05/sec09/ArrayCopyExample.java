package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //길이 3인 배열
        String[] oldStrArray = {"java", "array", "copy"};
        //길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];
        //배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
                /*
                - 첫 번째: 원본 배열 (oldStrArray)
                - 두 번째: 원본 배열의 복사 시작 위치 (0)
                - 세 번째: 새 배열 (newStrArray)
                - 네 번째: 새 배열의 붙여넣기 시작 위치 (0)
                - 다섯 번째: 복사할 요소 개수 (oldStrArray.length)
                */
        //배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
