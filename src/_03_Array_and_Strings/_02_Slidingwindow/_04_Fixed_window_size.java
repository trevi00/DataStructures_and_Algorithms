package _03_Array_and_Strings._02_Slidingwindow;

public class _04_Fixed_window_size {
    public static int fn(int[] arr, int k) {
        // curr: 윈도우를 추적하기 위한 데이터 타입
        int curr = 0;

        // 첫 번째 윈도우 구성
        for (int i = 0; i < k; i++) {
            // curr 또는 다른 변수를 사용하여 첫 번째 윈도우 구성 작업 수행
        }

        int ans = 0; // 결과 변수, 문제에 따라 curr과 같을 수도 있음
        for (int i = k; i < arr.length; i++) {
            // arr[i]를 윈도우에 추가
            // arr[i - k]를 윈도우에서 제거
            // ans 업데이트
        }

        return ans;
    }


    public static int fn2(int[] arr, int k) {
        // curr: 윈도우를 추적하기 위한 데이터 타입
        int curr = 0;

        int ans = 0; // 결과 변수
        for (int i = 0; i < arr.length; i++) {
            if (i >= k) {
                // ans 업데이트
                // arr[i - k]를 윈도우에서 제거
            }

            // arr[i]를 윈도우에 추가

        }

        // ans 업데이트

        return ans; // 문제가 최대 값을 요구하고 curr이 해당 값을 추적하고 있다면
        // max(ans, curr)와 같은 방식으로 반환할 수 있습니다.
    }

}
