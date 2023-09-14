package _04_Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _06_MissingNumber {
    // 정수 배열 nums 주어짐
    // 범위가 n 원래 배열은 [0, n]이라고 함
    // 배열에서 누락된 범위의 유일한 숫자를 반환함

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 6, 7};
        System.out.println(MissingNumperPretixSum(nums));
        System.out.println(MissingNumber(nums));
    }

    public static int MissingNumber(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            seen.add(nums[i]);
        }
        int ans = -1;
        for(int i = 0; i <= nums.length; i++){
            if(!seen.contains(i)){
                ans = i;
            }
        }
        return ans;
    }

    public static int MissingNumperPretixSum(int[] nums){
        int pretix = nums.length*(nums.length+1)/2;
        int ans = 0;
        for (int num: nums
             ) {
            ans += num;
        }
        return ans = pretix - ans;
    }
}
