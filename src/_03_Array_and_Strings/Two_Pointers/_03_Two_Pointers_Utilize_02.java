package _03_Array_and_Strings.Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class _03_Two_Pointers_Utilize_02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 20};
        int[] arr2 = {3, 5, 6};
        System.out.println(combine(arr1, arr2));
    }

    //두 개의 정렬된 정수 배열이 주어지면 두 배열을 모두 결합하고 정렬된 배열을 반환합니다.
    public static List<Integer> combine(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }
}
