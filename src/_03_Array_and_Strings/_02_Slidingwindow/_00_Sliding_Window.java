package _03_Array_and_Strings._02_Slidingwindow;

import java.util.ArrayList;

public class _00_Sliding_Window {
    //투 포인터와 마찬가지로 슬라이딩 윈도우는 배열 및 문자열과 동일하게 작동한다
    //중요한 점은 정렬된 요소가 있는 반복 가능하다는 것

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 1};
        System.out.println(Slidingwindow(arr));
    }

    public static int fn(int[] arr) {
        int left = 0;
        // curr: 윈도우를 추적하기 위한 데이터 타입
        int curr = 0;
        int ans = 0; // 결과 변수
        boolean condition = curr < 7; //조건

        for (int right = 0; right < arr.length; right++) {
            // arr[right]를 윈도우에 "추가"하는 로직 수행

            while (left < right && !(condition)) { //조건에 맞지 않을때 while문 작동
                // arr[left]를 윈도우에서 "제거"하는 로직 수행
                left++;
            }

            // 결과를 업데이트하는 로직 수행
        }

        return ans;
    }

    public static int Slidingwindow(int[] arr){ //슬라이딩 윈도우의 동작원리 확인
        int left = 0;
        int window = 0;
        // 조건은 window에 요소의 합이 3이하만 있도록 하는것
        int windowCondition = 3;

        // for안에 while문이 있지만 상각분석에 의해서 이 함수의 시간복잡도는 최악의 경우 O(N)
        for(int right = 0 ; right<arr.length; right++){
            window += arr[right]; // 창에 추가, 여기서 arr의 요소는 1로만 이루어져 있음.

            while(left < right && window > windowCondition){ // 조건이 충족이 안될 시에 작동
                window -= arr[left]; //창에 왼쪽에 있는 것을 제거
                left++;
            }
        }
        return arr.length - left; // 슬라이딩윈도우 작동이 끝나고 창에 있는 원소의 개수
    }
}
