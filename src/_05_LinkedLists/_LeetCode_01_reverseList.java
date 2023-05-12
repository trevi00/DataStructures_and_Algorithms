package _05_LinkedLists;

public class _LeetCode_01_reverseList {

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode head = new ListNode(1, l2);

        ListNode curr = reverseList(head);
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode next = head;
        ListNode curr = null;
        ListNode prev = null;

        while(next != null){
            prev = curr;
            curr = next;
            next = next.next;
            curr.next = prev;
        }

        return curr;
    }
}
