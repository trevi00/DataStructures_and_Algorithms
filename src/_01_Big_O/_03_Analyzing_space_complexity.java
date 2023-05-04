package _01_Big_O;

public class _03_Analyzing_space_complexity { // 공간복잡도 분석
    public static void main(String[] args) {
        int num = 5;

        // 공간복잡도 O(1)
        for (int i = 0; i < num; i++) {
            System.out.println(num);
        }

        System.out.println("----------------------");

        int[] arr = {1, 2, 3};

        // 공간복잡도 O(N)
        int[] doubleNums = new int[3];
        for (int i = 0; i < arr.length; i++) {
            doubleNums[i] = arr[i]*2;
            System.out.println(doubleNums[i]);
        }

        System.out.println("----------------------");

        // 공간복잡도 O(N/100) = O(N)
        int[] nums = new int[3];
        int oneHundreadth = arr.length / 100;
        for (int i = 0; i < oneHundreadth; i++) {
            nums[i] = arr[i];
            System.out.println(nums[i]);
        }

    }
}
