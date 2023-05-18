package _03_Array_and_Strings._02_Slidingwindow;

public class _07_Max_Consecutive_Ones_3 {
    // 1. 이진 배열 nums가 주어짐
    // 2. 정수 k가 주어짐
    // 3. 0을 1로 뒤집을 수 있는 횟후는 k
    // 4. 배열의 원소 1이 위 조건을 활용하여 최대한 긴 길이를 반환

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int ans = 0; // will use Math.max
        int index = k;

        for (int right = 0; right < nums.length; right++) {
            // index를 소진해서 배열의 0을 뒤집음 index가 0이면 더 못뒤집음

            //ex 1 1 1 0 0 0 1 1 1 1 0
            // 이번차례 원소가 0일 경우
            // 1. index가 -1이 아니면 index를 소진해서 1로 바꿈
            // 2. index가 -1이면, 바꿨던 0의 위치까지 올겨서 다시 뒤집고 이어감.
            if(nums[right] == 0){
                index--;
            }
            while(index == -1){
                if(nums[left] == 0){
                    index++;
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
