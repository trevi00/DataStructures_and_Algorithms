package _03_Array_and_Strings._01_TwoPointers;

public class _01_Two_Pointers {

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("asdfdsa"));
        String s = "asdfdsa";
        System.out.println(checkIfPalindromeRecursion(s, 0, s.length()-1));
    }

    // 양끝단의 포인터가 서로를 만날때까지 이동
    public static boolean checkIfPalindrome(String s) {

        int left = 0; // 포인터1
        int right = s.length() - 1; //포인터2

        //양단에서 시작해서 다른게 있으면 false 반환
        //예를들어 examaxe는 거짓을 반환하지 않는다.
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean checkIfPalindromeRecursion(String s, int left, int right) {
        if(left > right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;

        return checkIfPalindromeRecursion(s, left, right);
    }
}
