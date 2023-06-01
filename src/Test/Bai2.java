package Test;

public class Bai2 {
    public static LinkedList merge(LinkedList list1, LinkedList list2){
        LinkedList newList = new LinkedList();

        Node curr1 = list1.getHead();
        Node curr2 = list2.getHead();

        while(curr1 != null && curr2 != null){
            if(curr1.getValue() <= curr2.getValue()){
                newList.add(curr1.getValue());
                curr1 = curr1.getNext();
            }else{
                newList.add(curr2.getValue());
                curr2 = curr2.getNext();
            }
        }

        while(curr1 != null){
            newList.add(curr1.getValue());
            curr1 = curr1.getNext();
        }

        while(curr2 != null){
            newList.add(curr2.getValue());
            curr2 = curr2.getNext();
        }

        return newList;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        int[] value1 = {1,3,5,7,9};
        int[] value2 = {2,4,6,8,10};

        list1.add(value1);
        list2.add(value2);

        // 1 2 3 4 5 6 7 8 9 10
        LinkedList newlist = merge(list1, list2);

        newlist.print();
    }
}
