package _01_Big_O;

public class _01_Analyzing_time_complexity { //시간복잡도 분석
    public static void main(String[] args) {
        int num = 5;
        int num2 = 3;

        // 시간복잡도 O(N)
        for (int i = 0; i < num; i++) {
            System.out.println(num);
        }

        System.out.println("-----------------------");

        // 시간복잡도 O(N)
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(num);
            }
        }

        System.out.println("-----------------------");

        // 시간복잡도 O(N^2)
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println(num*num2);
            }
        }

        System.out.println("-----------------------");

        // 시간복잡도 O(2N + M) => O(N + M)
        for (int i = 0; i < num; i++) {
            System.out.println(num);
        }
        for (int j = 0; j < num; j++) {
            System.out.println(num);
        }
        for (int k = 0; k < num2; k++) {
            System.out.println(num2);
        }

    }
}
