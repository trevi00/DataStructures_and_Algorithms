package _03_Array_and_Strings._01_TwoPointers;

public class _04_Two_Pointers_Utilize_03 {
    public static void main(String[] args) {
        String s = "ace";
        String t = "adcfe";

        System.out.println(isSubsequence(s, t));

        char[] sc = {'H', 'L', 'L'};
        System.out.println(sc);

    }

    public static boolean isSubsequence(String s, String t){
        int i = 0, j = 0;
        while( i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
