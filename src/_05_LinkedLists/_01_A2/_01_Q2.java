package _05_LinkedLists._01_A2;

import _05_LinkedLists.ListNode;

public class _01_Q2 {
    public static void main(String[] args) {
        ListNode l1_3 = new ListNode(3);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1_1 = new ListNode(2, l1_2);

        ListNode l2_3 = new ListNode(5);
        ListNode l2_2 = new ListNode(6, l2_3);
        ListNode l2_1 = new ListNode(4, l2_2);

        Solution sl = new Solution();
        sl.addTwoNumbers(l1_1, l2_1);
    }
}
