package linkedList.llUsingRecursively;

import java.util.Scanner;

public class PrintReversally {
    public static void printReverse(Node<Integer> head){
        if(head == null){
            return;
        }

        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        Node<Integer> head=null,tail=null;

        while(data != -1){
            Node<Integer> temp=new Node<Integer> (data);
            if(head == null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        printReverse(head);
    }
}
