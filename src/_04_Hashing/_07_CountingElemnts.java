package _04_Hashing;

import java.util.HashSet;
import java.util.Set;

public class _07_CountingElemnts {
    // 정수배열 arr 주어짐.
    // x가 있으면 x+1이 있는지가 궁금한 것임.

    public static int countElements(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for (int num: arr
             ) {
            seen.add(num);
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(seen.contains(arr[i]+1)){
                ans++;
            }
        }
        return ans;
    }
}
