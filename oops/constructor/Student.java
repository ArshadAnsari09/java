package oops.constructor;

public class Student {
    public String name;
    final private int rollNo;
    public final static double  CONVERSIONFACTOR=0.95;
    private static int numStudents; //creating single variable which belong to class

    // constructor
    public Student(String name) {
      this.name=name;
      numStudents++;
      this.rollNo=numStudents;

    }

    //another constructor
    // public Student(String n){
    //     name=n;
    // }

    public void print(){
        System.out.println(name+" "+rollNo);
    }

    public static  int getNumStudent(){
        return numStudents;
    }

    // making rollNo object to accessible thoughout where we want to use it
    public int getRollNumber() {
        return this.rollNo;
    }

    public void setRollNumber(int rollNo) {
        if (rollNo < 0) {
            return;
        }
        // this.rollNo = rollNo;
    }
}
