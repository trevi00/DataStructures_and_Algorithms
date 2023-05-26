package _03_Array_and_Strings.LEETCODE;

public class _557_ReverseWordsInAString3 {
    // 1. 문자열 s가 주어지면
    // 2. 공백과 초기 단어 순서를 유지하면서
    // 3. 문장 내 각 단어의 문자 순서를 반대로 바꾼다.

    // 다음 창에 공백이 담길때, 문자열을 뒤집어 anser에 저장한다. 공백은 그대로여야 한다.
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String var = "";
        String ans  = "";
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            var += s.charAt(right); // "Let's "

            /* SlidingWindow's theory
            if(s.charAt(left) == ' '){
                left++;
            }*/

            while (s.charAt(right) == ' ' && left < right){
                StringBuilder sb = new StringBuilder(var.substring(0,var.length()-1));
                ans += sb.reverse() + " ";
                System.out.println(sb);
                var = "";
                left = right;
            }

            if(right == s.length()-1){
                StringBuilder sb = new StringBuilder(var.substring(0,var.length()));
                ans += sb.reverse();
                var = "";
                left = right;
            }

        }
        return ans;
    }
}
