package linkedList.llUsingRecursively.assignment;

import java.util.Scanner;

import linkedList.linkedlist.Node;

public class DeleteEveryNode {

    public static Node<Integer> delete(Node<Integer> head,int m,int n){
       if(m==0 || head==null){
        return null;
       }
       if(n==0)
       return head;

       Node<Integer> currNode=head;
       Node<Integer> temp=null;

       while(currNode != null){
        int take=0;
        int skip=0;
        while(currNode !=null && take < m){
            if(temp==null){
                temp=currNode;
            }else{
                 temp.next=currNode;
                 temp=currNode;
            }
            currNode=currNode.next;
            take+=1;
        }
        while(currNode !=null && skip<n){
            currNode=currNode.next;
            skip++;
        }
       }
       if(temp!=null){
        temp.next=null;
       }
       return head;
    }
    public static void printR(Node<Integer> head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
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
        System.out.print("Before deleting: ");
        printR(head);
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of m :you want to skip starting numbers: ");
        int m=s.nextInt();
        System.out.print("Enter the value of n :you want to delete numbers: ");
        int n=s.nextInt();
        head=delete(head,m,n);
        System.out.print("After deleting: ");
        printR(head);
    }
}
