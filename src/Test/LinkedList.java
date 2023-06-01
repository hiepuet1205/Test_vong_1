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
            head = new Node(value, null);
        }else{
            Node curr = head;

            while (curr.getNext() != null){
                curr = curr.getNext();
            }

            curr.setNext(new Node(value, null));
        }

        size++;
    }

    public void add(int[] values){
        for(int v : values){
            this.add(v);
        }
    }

    public void remove(Node nodeToRemove){
        if (nodeToRemove == null || head == null) {
            return;
        }

        Node curr = head;

        if(curr == nodeToRemove){
            head = head.getNext();
        }

        while(curr.getNext() != null && curr.getNext() != nodeToRemove){
            curr = curr.getNext();
        }

        if(curr.getNext() != null){
            curr.setNext(curr.getNext().getNext());
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
