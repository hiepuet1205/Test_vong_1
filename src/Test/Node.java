package Test;

public class Node {
    private int value;

    private Node prev;

    public Node(int value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
