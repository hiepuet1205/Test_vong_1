package Test;

import java.util.ArrayList;
import java.util.Random;

public class Bai3 {

    // generate linkedList
    public static ArrayList<LinkedList> generateLinkedList(int num){
        ArrayList<LinkedList> list = new ArrayList<>();

        for(int i=0; i<num; i++){
            LinkedList newLinkedList = new LinkedList();

            int[] values = new int[5];
            Random random = new Random();

            values[0] = random.nextInt(10000);

            // gia tri sau lon hon gia tri truoc
            for(int j=1; j<5; j++){
                values[j] = values[j-1] + random.nextInt(10000);
            }

            newLinkedList.add(values);

            list.add(newLinkedList);
        }

        return list;
    }

    public static void main(String[] args) {
        // generate 32 linkedList
        ArrayList<LinkedList> list = generateLinkedList(32);

        LinkedList newLinkedList = new LinkedList();

        for(LinkedList linkedList : list){
            // su dung ham merge trong bai 2
            newLinkedList = Bai2.merge(newLinkedList, linkedList);
        }

        newLinkedList.print();

        // moi linkedlist co 5 node
        // 32 linkedList => 160
        System.out.print("Size: " + newLinkedList.getSize());

    }
}
