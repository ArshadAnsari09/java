package oops.polynomial;

public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1=new Polynomial();
        p1.setCoefficient(0, 3);
        // System.out.print("Value of p1.print when deg=3 and coeff=3: ");
        // p1.print();
        // p1.setCoefficient(2, 2);
        // System.out.print("Value of p1.print when deg=2 and coeff=2: ");
        p1.print();

        Polynomial p2=new Polynomial();
        p2.setCoefficient(2, 2); 
        // System.out.print("Value of p1.print when deg=0 and coeff=2: ");
        p2.print();
        // p2.setCoefficient(0, 2);
        
        p1.add(p2);
        // System.out.print("After adding p1 and p2 : ");
        p1.print();
        // p2.print();

        // p2.multiply(p1);
        // p2.print();

    }
}
