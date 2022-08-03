package oops.componentsInOOPs.inheritance_temp;

import oops.componentsInOOPs.inheritance.Vehicle;
public class VehicleUse2 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        // v.maxSpeed=10;  //through an error when we initialize maxSpeed to protected beacause this is not a derived class
    }
}
