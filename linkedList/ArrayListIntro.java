package linkedList;
import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,50);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        
        //printing ArrayList
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        //forEach Loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
