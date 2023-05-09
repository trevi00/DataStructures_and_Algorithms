package _03_Array_and_Strings._01_TwoPointers;

public class _02_Two_Pointers_Utilize {
    public static void main(String[] args) {
        //투포인터의 합이 13이 되는지 확인하시오.
        int[] arr = {1, 2, 4, 6, 8, 9, 14, 15};
        int left = 0;
        int right = arr.length-1;
        System.out.println(checkIfPalindrome2(arr, left, right, 13));
    }

    public static boolean checkIfPalindrome2(int[] arr, int left, int right, int target){

        if(left>right){
            return false;
        } else if(arr[left] + arr[right] == target){
            return true;
        }

        if(arr[left] + arr[right] > target){
            right--;
        }
        else if (arr[left] + arr[right] < target){
            left++;
        }

        return checkIfPalindrome2(arr, left, right, target);
    }
}
