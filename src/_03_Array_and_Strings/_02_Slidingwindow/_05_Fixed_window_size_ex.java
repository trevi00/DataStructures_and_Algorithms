package _03_Array_and_Strings._02_Slidingwindow;

public class _05_Fixed_window_size_ex {
    public static void main(String[] args) {
        int[] arr = {3, -1, 4, 12, -8, 5, 6};
        System.out.println(findBestSubarrayBasic(arr, 4));
        System.out.println(findBestSubarray(arr, 4));
    }
    // 정수 배열 nums와 정수 k가 주어지면 길이가 k인 가장 큰 합계를 가진 하위 배열을 찾는다.
    public static int findBestSubarrayBasic ( int[] nums, int k ){
        int curr = 0;
        int left = 0;
        int ans = 0;

        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        ans = curr;

        for (int right = k; right < nums.length; right++) {
            curr += nums[right];

            while(right - left != k-1){
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, curr);
        }

        return ans;
    }

    public static int findBestSubarray(int[] nums, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}

