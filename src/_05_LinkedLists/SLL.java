package _05_LinkedLists;

public class SLL {
    int size = 0;
    ListNode head;

    public SLL(){
        head = null;
    }

    public void addFront(int e){
        ListNode node = new ListNode(e, head);
        head = node;
        size++;
    }

    public int front() throws Exception {
        if(head == null){
            throw new Exception("null");
        }
        return head.val;
    }

    public void removeFront(){
        if(head != null) {
            head = head.next;
            size--;
        }
    }

    public int getSize(){
        return size;
    }

    public void print(){
        if(head != null) {
            ListNode index = head;
            for (int i = 0; i < size; i++) {
                System.out.print(index.val + " ");
                index = index.next;
            }
            System.out.println();
        }
    }

}
