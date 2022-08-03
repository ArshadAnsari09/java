package oops.componentsInOOPs.inheritance;

public class Car extends Vehicle{
    int numDoors;
    // int maxSpeed;

    public Car(int numDoors,int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's constructor");
        this.numDoors=numDoors;
    }

    public void print(){
        super.print();   //go to inside Vehicle class and search print function i.e. parent class
        System.out.println("Car "+ " numDoors "+numDoors);
    }

    public void printMaxSpeed(){
        System.out.println(maxSpeed+" "+super.maxSpeed);    //super.maxSpeed i.e. go to parent class to search maxSpeed initially=0
    }
}
