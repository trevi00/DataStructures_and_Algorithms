package _03_Array_and_Strings._02_Slidingwindow;

public class _03_Number_of_subarrays {
    // 정수 배열 nums와 정수k가 주어지면
    // 하위 배열에 있는 모든 요소의 곱이 k보다 작은 연속 하위 배열의 수를 반환합니다.

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int window = 1;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            // 10 5 2 6, 100
            window *= nums[right];

            while(left < right && window >= k){
                window /= nums[left];
                left++;
            }

            if( nums[right] == 1 && window < k )
                result += right - left + 1;
        }

        return result;
    }
}
