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

    public int numSubarrayProductLessThanKBetter(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr /= nums[left];
                left++;
            }
            ans += right - left + 1; // 길이를 최끝단의 숫자를 기준으로 경우의 수를 따진다.
        }

        return ans;
    }
}
