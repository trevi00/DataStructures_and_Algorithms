package _03_Array_and_Strings.LEETCODE;

public class _TODO_283_MoveZeroes {
    //nums int 배열이 주어짐
    //0은 끝으로 보내야함
    //배열의 복사본을 만들지 않고 이 작업을 제자리에서 수행해야함
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

    }
    public static void moveZeroes(int[] nums) {

        for (int right = 0; right < nums.length; right++) {
            int index = right;
            while(nums[right] == 0){
                int temp = nums[index+1];
                nums[index] = temp;
            }
        }
        for (int num:
             nums) {
            System.out.println(num);
        }
    }
}
