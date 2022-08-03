package linkedList;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
    //    System.out.println(list.get(1));
        list.add(30);
        list.addFirst(60);
        // System.out.println(list.get(0));
        list.add(2,40);
        // System.out.println(list.get(2));
        list.set(2,50);
        // System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove();
        list.remove(2);
        System.out.println("after removing");

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
