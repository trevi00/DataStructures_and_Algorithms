package _05_LinkedLists.SG_LinkedList_PT;

public class DLL {
    int size = 0;
    ListNodeD head;
    ListNodeD tail;

    public DLL(){
        head = null;
        tail = null;
    }

    public void addFront(int e){
        ListNodeD node = new ListNodeD(e);
        if (head != null) {
            node.next = head;
            head.prev = node;
            head = node;
        } else {
            head = node;
            tail = node;
        }
        size++;
    }


    public void addBack(int e){
        ListNodeD node = new ListNodeD(e);
        if (head != null) {
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            head = node;
            tail = node;
        }
        size++;
    }


    public int front() throws Exception {
        if(head == null){
            throw new Exception("null");
        }
        return head.val;
    }

    public int back() throws Exception {
        if (tail != null) {
            return tail.val;
        } else if (head != null) {
            return front();
        }
        throw new Exception("null");
    }


    public void removeFront(){
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
        }
    }


    public void removeBack(){
        if (tail != null) {
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
        } else if (head != null){
            removeFront();
        }
    }


    public int getSize(){
        return size;
    }

    public void print(){
        if(head != null) {
            ListNodeD index = head;
            for (int i = 0; i < size; i++) {
                System.out.print(index.val + " ");
                index = index.next;
            }
            System.out.println();
        }
    }

    public void printR(){
        if(tail != null) {
            ListNodeD index = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(index.val + " ");
                index = index.prev;
            }
            System.out.println();
        }
    }

}
