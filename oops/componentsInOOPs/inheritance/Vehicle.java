package oops.componentsInOOPs.inheritance;

public class Vehicle {
    private String color;
    protected int maxSpeed;
    // public int maxSpeed;

    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's constructor");
        this.maxSpeed=maxSpeed;
    }

    public Vehicle(){

    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Vehicle "+ "Color: "+color+ " maxSpeed: "+maxSpeed);
    }
}
