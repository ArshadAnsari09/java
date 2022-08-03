package linkedList.llUsingRecursively;

import java.util.Scanner;

public class MergeTwoSortedLL {
    public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1; // updating tail
                t1 = t1.next; // updating like i++
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        // One of list is finished
        if(t1 != null ){
            tail.next=t1;
        }
        if(t2 != null){
            tail.next=t2;
        }
        return head;
    }

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> temp = new Node<Integer>(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = takeInput();
        // System.out.print("First LL is : ");
        // printR(head1);
        System.out.println();
        Node<Integer> head2 = takeInput();
        // System.out.print("Second LL is : ");
        // printR(head2);
        Node<Integer> head = mergeLL(head1, head2);
        System.out.print("List after merging: ");
        printR(head);
    }
}
