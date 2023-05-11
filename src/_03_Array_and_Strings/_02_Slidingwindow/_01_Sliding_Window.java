package _03_Array_and_Strings._02_Slidingwindow;

public class _01_Sliding_Window {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(findLength(nums, 8));
    }

    //예제
    //양의 정수 배열 nums와 정수 k가 주어지면 합계가
    // k보다 작거나 같은 가장 긴 하위 배열의 길이를 찾는다.
    public static int findLength(int[] nums, int k) { // 시간복잡도 : O(N), 공간복잡도 : O(1)
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
