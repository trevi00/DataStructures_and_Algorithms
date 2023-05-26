package _03_Array_and_Strings.LEETCODE;

public class _917_ReverseOnlyLetters {
    // 문자열 s가 주어지면, 뒤집어라 룰을 통해서
    // 1. 모든 영문자들이 아닌 문자들은 같은 자리에 있어야한다.
    // 2. 모든 영문자들은 뒤집어져야한다.
    // 이후에 s를 반환해라

    // s의 길이는 1부터 100 사이이다.
    // 아스키코드가 힌트이다
    // s는 \나 \\를 포함하지 않는다.
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        StringBuilder ans = new StringBuilder();
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j)))
                    j--;
                ans.append(s.charAt(j--));
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
