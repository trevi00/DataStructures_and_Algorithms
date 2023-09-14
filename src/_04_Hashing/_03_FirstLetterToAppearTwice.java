package _04_Hashing;

import java.util.HashSet;
import java.util.Set;

public class _03_FirstLetterToAppearTwice {
    // 문자열 s가 주어진다
    // 첫번째 문자의 중복되는 두번째를 반환한다.
    // abcdd
    // return d
    public static void main(String[] args) {
        String s = "abcdd";
        System.out.println(repeatedCharacter(s));
        System.out.println(RepeatCharcter(s));
    }

    public static char repeatedCharacter(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < i; j++){
                if(s.charAt(j) == c){
                    return c;
                }
            }
        }
        return ' ';
    }

    public static char RepeatCharcter(String s){
        Set<Character> seen = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(seen.contains(c)){
                return c;
            }

            seen.add(c);
        }
        return ' ';
    }
}
