package _03_Array_and_Strings._03_Prefix_sum;

public class _03_Running_Sum_of_1d_Array {
    // 배열 nums
    // nums 범위가 int로 못담음
    public int[] runningSum(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }
}
