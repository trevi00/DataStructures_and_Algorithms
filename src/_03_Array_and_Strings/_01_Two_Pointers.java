package _03_Array_and_Strings;

public class _01_Two_Pointers {

    // 양끝단의 포인터가 서로를 만날때까지 이동
    public boolean checkIfPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
