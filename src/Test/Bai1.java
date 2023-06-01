package Test;

public class Bai1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int[] values = {1,2,1,3,1,4,1,5,1,6};

        list.add(values);

        // 2 3 4 5 6
        list.removeNodesByValue(1);

        list.print();
    }
}
