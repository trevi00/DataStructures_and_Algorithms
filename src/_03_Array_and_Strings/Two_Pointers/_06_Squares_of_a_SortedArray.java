package _03_Array_and_Strings.Two_Pointers;

import java.util.Arrays;

public class _06_Squares_of_a_SortedArray {
    public static void main(String[] args) {
        int[] nums = { -7, -3, 2, 3, 11 };
        for (int num: sortedSquares(nums)) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) { //시간복잡도 O(N)
        int n = nums.length;

        int[] result = new int[n];
        int left = 0;
        int right = n-1;

        for (int i = n-1; i >= 0 ; i--) {
            int index;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                index = nums[right];
                right--;
            }else{
                index = nums[left];
                left++;
            }
            result[i] = (int) Math.pow(index, 2);
        }
        return result;
    }

    public static int[] sortedSquares2(int[] A) { //시간복잡도 O( N * logN )
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];

        Arrays.sort(ans);
        return ans;
    }
}
