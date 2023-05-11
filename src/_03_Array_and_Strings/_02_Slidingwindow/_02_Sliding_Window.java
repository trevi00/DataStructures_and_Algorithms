package _03_Array_and_Strings._02_Slidingwindow;

public class _02_Sliding_Window {
    // 이진 하위 문자열s("0" 및 "1"만 포함하는 문자열 ) 이 제공됩니다.
    // 작업에는 "0"을 "1" 로 뒤집는 작업이 포함됩니다.
    // 하나의 작업만을 수행한 후에 "1"만 포함하는 가장 긴 하위 문자열의 길이는 얼마입니까?
    // 예를 들어 주어진 s = "1101100111", 답은 5입니다.
    // index 에서 연산을 하면 2문자열은 가 됩니다 1111100111.

    public static int findLength(String s) { // 시간복잡도 : O(N), 공간복잡도 : O(1)
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if ( s.charAt(right) == '0' ) {
                curr++;
            }

            while( curr > 1 ){
                if ( s.charAt(left) == '0' ){
                    curr--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
