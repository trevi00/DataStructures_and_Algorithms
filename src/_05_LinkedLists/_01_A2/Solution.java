package _05_LinkedLists._01_A2;

public class Solution {
    ListNode curr = new ListNode();
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 9 9 9 9 9 9 9
        // 9 9 9 - - - - ( - = null )
        // 8 9 9 0 0 0 0 1

        int index = 0;

        if (l1 == null && l2 == null){
            return null;
        }

        if ( curr.val == 1 ) {
            index = 1;
        }
        else if (curr == null || curr.val != 1){
            index = 0;
        }

        if (l1 == null && l2 != null) {
            curr.val = l2.val + index;
            return addTwoNumbers(null, l2.next);
        }

        if (l1 != null && l2 == null) {
            curr.val = l2.val + index;
            return addTwoNumbers(l1.next, null);
        }

        curr.val = l1.val + l2.val + index;
        if (curr.val/10 > 0){
            curr.val = (l1.val + l2.val + index)%10;
            curr.next.val = 1;
        }
        curr = curr.next;
        return addTwoNumbers(l1.next, l2.next);
    }
}
