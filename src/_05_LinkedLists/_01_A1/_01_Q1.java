package _05_LinkedLists._01_A1;

public class _01_Q1 {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(1);
        ListNode l2 = new ListNode(0, l3);
        ListNode l1 = new ListNode(1, l2);

        Solution sl = new Solution();
        System.out.println(sl.getDecimalValue(l1));
    }
}
