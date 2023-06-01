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
        Node curr = head;
        Node prev = curr;

        // node can xoa la node dau tien
        if(curr != null && curr == nodeToRemove){
            head = curr.getNext();
            size--;
        }

        while(curr != null && curr != nodeToRemove){
            prev = curr;
            curr = curr.getNext();
        }

        // khong tim thay node can xoa
        if(curr == null){
            return;
        }

        // xoa node
        prev.setNext(curr.getNext());
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
