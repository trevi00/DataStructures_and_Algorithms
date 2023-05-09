package _02_Recursion;

public class _02_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
        Fibo2(10);
    }

    //
    public static int Fibo(int n){
        if ( n < 1 ) {
            return 0;
        }
        if ( n == 1 ) {
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }

    //Fibo(n) = Fibo(n-1) + Fibo(n-2)
    //Fibo(n-2) = Fibo(n) - Fibo(n-1)
    //Fibo(N) = Fibo (N+2) - Fibo(N+1)

    public static void Fibo2(int n){
        if ( n == 1 ) {
            System.out.println(1);
            return;
        }
        int a = 0;
        int b = 1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = a + b;
            b = a;
            a = index;
        }
        System.out.print(index + " ");
        Fibo2(n-1);
    }

}
