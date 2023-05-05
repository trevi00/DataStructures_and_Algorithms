package _02_Recursion;

public class _01_print {
    public static void main(String[] args) {
        fn(1);
    }

    public static void fn(int i){
        if ( i < 0 || i > 10){
            return;
        }
        System.out.println(i);
        fn(i + 1);
    }
}
