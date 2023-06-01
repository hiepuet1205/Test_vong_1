package Test;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add (int value){
        if(head == null){
            // linkedlist empty
            head = new Node(value, null, null);
        }else{
            Node curr = head;

            while (curr.getNext() != null){
                curr = curr.getNext();
            }

            curr.setNext(new Node(value, curr, null));
        }

        size++;
    }

    public void add(int[] values){
        for(int v : values){
            this.add(v);
        }
    }

    public void remove(Node nodeToRemove){
        if (nodeToRemove == null) {
            return;
        }

        Node prev = nodeToRemove.getPrev();
        Node next = nodeToRemove.getNext();

        if (prev == null) {
            // Xóa node đầu tiên
            head = next;
        } else {
            prev.setNext(next);
        }

        if (next != null) {
            next.setPrev(prev);
        }

        size--;
    }

    public void removeNodesByValue(int value){
        Node curr = head;

        if(curr == null){
            return;
        }

        while(curr != null){
            Node temp = curr;
            if(curr.getValue() == value){
                remove(temp);
            }
            curr = curr.getNext();
        }
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
