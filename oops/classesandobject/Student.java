package oops.classesandobject;

public class Student {
    // String name;
    // int rollNo;
    public String name;
    private  int rollNo;
    
    //making rollNo object to accessible thoughout where we want to use it
    public int getRollNumber(){
        return this.rollNo;
    }

    public void setRollNumber(int rollNo){
        if(rollNo<0){
            return;
        }
        this.rollNo=rollNo;
    }
}



