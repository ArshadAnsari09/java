package oops.componentsInOOPs.inheritance_temp;

import oops.componentsInOOPs.inheritance.Vehicle;

public class Truck extends Vehicle{
    int maxLoadingCapacity;

    public void print(){
        System.out.println("Truck "+ "Color: "+getColor()+ " maxSpeed: "+maxSpeed+ " maxLoadingCapacity "+maxLoadingCapacity);
    }
}
