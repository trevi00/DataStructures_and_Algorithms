package _04_Hashing;

import java.util.HashSet;
import java.util.Set;

public class _05_Pangram {
    // 알파벳 소문자 a~z까지 전부 존재하는 문자열을 팬그램이라고 한다
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    public static boolean checkIfPangram(String s){
        Set<Character> seen = new HashSet<>();
        for(char currChar : s.toCharArray()){
            seen.add(currChar);
        }
        return seen.size() == 'z'-'a'+1;
    }
}
