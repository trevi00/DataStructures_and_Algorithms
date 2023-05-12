package _05_LinkedLists._01_A1;

import _05_LinkedLists.ListNode;

public class Solution {
    public int getDecimalValue(ListNode head) { // 101(2)
        if ( head == null ){
            return 0;
        }

        ListNode temp = head;

        int index = 0;

        while(temp != null){
            index++;
            temp = temp.next;
        }

        int value = (int) (head.val*Math.pow(2,index-1));
        return getDecimalValue(head.next) + value;
    }
}
