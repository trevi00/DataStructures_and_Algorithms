package _04_Hashing;

import java.util.HashMap;
import java.util.Map;

public class _02_TwoSum {
    // 정수 배열 nums가 주어진다.
    // 정수 target이 주어진다.
    // 반환하여야 할것은 두가지 숫자의 합이 target이 되기위한 숫자의 위치이다. target = nums[i] + nums[j]
    // return i j

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        for (int num: twoSum(nums, target)) {
            System.out.print(num + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> dic = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int complement = target - num;
            if(dic.containsKey(complement)){
                return new int[] {i, dic.get(complement)};
            }
            dic.put(num, i);
        }

        return new int[] {-1, -1};
    }
}
