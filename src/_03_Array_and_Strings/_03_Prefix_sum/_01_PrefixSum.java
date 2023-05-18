package _03_Array_and_Strings._03_Prefix_sum;

public class _01_PrefixSum {
    // Prefix sum 은 정수 배열과 함께 사용할 수 있는 기술이다.
    // Prefix sum을 사용하면, O(1) 공간의 하위 배열의 합계를 찾을 수 있다.
    // 시간복잡도는 최대 O(N)으로 줄일 수 있다.
    /*pseudocode :
    * Given an integer array nums,
    *
    * prefix = [nums[0]]
    * for i in [1, len(nums) - 1]:
    *   prefix.append(nums[i] + prefix[prefix.length - 1])*/

    // example :
    // 1. int 배열 nums가 주어짐
    // 2. 2차원 배열 queries[][]와 정수 limit가 주어짐
    // 3. 답으로는 쿼리에 대한 참거짓을 부울 배열로 저장
    // 4. 조건은 queries의 [x, y]가 nums의 원소들의 left right이고
    // 그만큼의 합이 limit보다 작으면 true 아니면 false
    public static boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            int curr = prefix[y] - prefix[x] + nums[x]; // x-1로 숏코딩 하지 않은 이유는 x가 일때의 예외 때문
            ans[i] = curr < limit;
        }

        return ans;
    }
}
