package _03_Array_and_Strings._03_Prefix_sum;

public class _02_Number_of_Ways_to_Split_Array {
    // 길이가 n인 정수 배열 nums가 주어짐.
    // index = 0
    public int waysToSplitArray(int[] nums) {
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (prefix[i] >= prefix[nums.length - 1] - prefix[i]) {
                ans++;
            }
        }

        return ans;
    }
}
