package _03_Array_and_Strings._04_String_Building;

//StringBuilder class를 사용하는 것은
//1.문자열을 만들때, 문자들로 리스트를 추가한다.
//이것은 O(1)의 공간복잡도를 가진다. 공간복잡도는 작지만 수정에 어려움을 겪는다.
//2.이때, StringBuilder.toString()을 사용하면 O(n)의 공간복잡도를 가지는 문자열을 구축한다.
//이것은 시간복잡도에 유리함을 갖는다.

public class _01_StringBuilderClass {
    public static String buildString ( String s ){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((s.charAt(i)));
        }

        return sb.toString();
    }
}
