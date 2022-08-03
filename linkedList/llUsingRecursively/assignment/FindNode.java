package linkedList.llUsingRecursively.assignment;

import java.util.Scanner;

import linkedList.llUsingRecursively.Node;

public class FindNode {
    public static int findNode(Node<Integer> head,int n){
       if(head == null){
           return -1;
       }
       if(head.data.equals(n)){
           return 0;
       }
       int smallAns=findNode(head.next, n);
       if(smallAns == -1){
            return -1;
       }
       return smallAns+1;
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
    Node<Integer> list=takeInput();
    int ans=findNode(list,4);
    System.out.println(ans);
   }

}
