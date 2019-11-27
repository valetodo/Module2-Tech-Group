

import java.util.Iterator;
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

    public static void insertSorted(LinkedList<Integer> list, int value) {

        if (list != null) {
            int sizeList = list.size();
            for (int num = 0; num < sizeList; num++) {
                if (list.get(num) >= value) {
                    list.add(num, value);
                }
            }
            for (Object number : list) {
                System.out.println(number);

            }
        }

    }


    public static void removeMaximumValues(LinkedList<String> list, int N) {
        if (list != null && N > 0) {
            int count = 0;
            while (count < N) {
                String lastValue = list.getLast();
                for (int num = 0; num < list.size(); num++) {
                    if (lastValue.compareTo(list.get(num)) <= 0)
                        lastValue = list.get(num);
                }
                for (int num = 0; num < list.size(); num++) {
                    if (lastValue.compareTo(list.get(num)) == 0)
                        list.remove(num);
                }
                count++;
            }
            for (Object number : list) {
                System.out.println(number);

            }
        }

    }

    public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

        int sizeLimitTwo = 0;
        int sizeLimitOne = 0;
        while (sizeLimitOne < one.size()) {
            if (one.get(sizeLimitOne).equals(two.get(sizeLimitTwo))) {
                sizeLimitOne++;
                sizeLimitTwo++;
            } else {
                sizeLimitTwo = 0;
            }
        }
        return true; // this line is here only so this code will compile if you don't modify it
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.add(6);
        linkedlist.add(7);
        linkedlist.add(8);

        LinkedList<Integer> two = new LinkedList<>();
        two.add(3);
        two.add(4);
        two.add(5);

        LinkedListUtils.containsSubsequence(linkedlist, two);
//        LinkedListUtils.insertSorted(linkedlist, 4);

//        LinkedList<String> list = new LinkedList<>();
//        list.add("hola");
//        list.add("mundo");
//        list.add("todo");
//        list.add("esta");
//        list.add("todo");
//        list.add("mundo");
//        LinkedListUtils.removeMaximumValues(list, 4);
    }
}
