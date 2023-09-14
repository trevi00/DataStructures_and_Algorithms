package _03_Array_and_Strings;

import java.util.Scanner;

public class _01_Josephus_slidingwindow {
    public static void main(String[] args) {
        int n = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int[] nArr = new int[n];
        int curr = k-1;

        for (int i = 0; i < n; i++) {
            nArr[i] = arr[curr];
            arr[curr] = 0;
            curr += k;
            if(curr >= n){
                curr -= n;
            }
            int count = 0;
            while(arr[curr] == 0){
                curr++;
                if(curr >= n){
                    curr -= n;
                }
                if(count > k) {
                    count++;
                }
            }
        }

        System.out.println(nArr[n-2] + " " + nArr[n-1]);
    }
}
