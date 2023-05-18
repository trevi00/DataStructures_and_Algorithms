package _03_Array_and_Strings._02_Slidingwindow;

public class _06_Maximum_Average_Subarry_1 {
    // 1. int배열 nus가 주어짐.
    // 2. n개의 요소가 들어있음.
    // 3. 정수 k가 주어짐.
    // Q. 길이가 k일때의 최대 평균값을 찾고 싶음. 10^-5보다 작은 계산오류는 허용됨
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int curr = 0;
        double ans = 0;

        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }
        ans = ((double) curr)/k;

        for (int right = k; right < nums.length; right++) {
            curr += nums[right] - nums[right-k];
            ans = Math.max(ans, ((double) curr)/k);
        }
        return ans;
    }
}
