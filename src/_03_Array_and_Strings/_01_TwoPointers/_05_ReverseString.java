package _03_Array_and_Strings._01_TwoPointers;

public class _05_ReverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'E', 'L', 'L', 'O'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i < j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
