package _04_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _04_ListAndH {
    // 정수배열 nums 주어짐
    // nums 안의 숫자 x를 찾아라
    // x란 x+1과 x-1이 num안에 없는 숫자다.
    public static void main(String[] args) {
        int[] nums = {1, 3, 5,6,7, 9};
        List<Integer> lt = findNumbers(nums);
        System.out.println(lt);
    }

    public static List<Integer> findNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        for(int num : nums){
            if(!numSet.contains(num+1) && !numSet.contains(num-1)){
                ans.add(num);
            }
        }
        return ans;
    }
}
