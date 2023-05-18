package _03_Array_and_Strings._03_Prefix_sum;

public class _04_Minimum_Value_to_Get_Positive_Step_by_Sum {
    // 정수배열 nums 주어짐
    // 시작값은 양수값임

    // 각 반복에서 계산해야함
    // 시작값 + 누적합들의 배열은
    // 원소들이 1이상이어야함.

    public int minStartValue(int[] nums) {
        int startValue = 1;

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        if(prefix[0]+startValue<1){
            startValue = prefix[0]*(-1)+1;
        }

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
            if(prefix[i]+startValue<1){
                startValue = prefix[i]*(-1)+1;
            }
        }

        return startValue;
    }

}
