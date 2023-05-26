package _03_Array_and_Strings.LEETCODE;

public class _557_Fast_ReverseWordsInAString3 {
    // 1. 문자열 s가 주어지면
    // 2. 공백과 초기 단어 순서를 유지하면서
    // 3. 문장 내 각 단어의 문자 순서를 반대로 바꾼다.

    // 다음 창에 공백이 담길때, 문자열을 뒤집어 anser에 저장한다. 공백은 그대로여야 한다.
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        for(int end =0; end <= chars.length; end++){
            if(end == chars.length || chars[end] == ' '){
                reverse(chars, start, end-1);
                start = end+1;
            }
        }
        return new String(chars);
    }
    static void reverse(char[] c, int start, int end){
        while(start<end){
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
}
