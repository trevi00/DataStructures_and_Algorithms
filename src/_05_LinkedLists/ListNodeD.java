package _05_LinkedLists;

public class ListNodeD {
    public int val;
    public ListNodeD next;
    public ListNodeD prev;

    public ListNodeD() {
        this.next = null;
        this.prev = null;
    }

    public ListNodeD(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public ListNodeD(int val, ListNodeD next, ListNodeD prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

