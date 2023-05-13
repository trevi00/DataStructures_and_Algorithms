package _05_LinkedLists;

public class _LeetCode_02_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int left = 0;
        int right = 0;
        ListNode ans = new ListNode();
        ListNode index = head;
        // 1 2 3 4 5
        while(index != null && index.next != null){
            index = index.next;
            right++;
        }
        while(left<right){
            left++;
            right--;
        }
        while(left>=0){
            left--; // 2 1 0
            ans = head; // 1 2 3
            head = head.next;
        }

        return ans;
    }
}
