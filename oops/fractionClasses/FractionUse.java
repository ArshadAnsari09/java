package oops.fractionClasses;

public class FractionUse {
    public static void main(String[] args) throws DivideByZeroException{
        Fraction f1=new Fraction(4,6);
        System.out.print("f1.print : ");
        f1.print();
        // f1.increment();
        // f1.print();
        // f1.setNumerator(8);
        // f1.getNumerator();
        // f1.print();

        Fraction f2=new Fraction(4,0);
        System.out.print("f2.print : ");
        f2.print();
        System.out.print("After addition of two fractions: ");
        f1.addFraction(f2);
        f1.print();
        System.out.print("After subtraction of two fractions: ");
        f1.subtract(f2);
        f1.print();

        f1.multiply(f2);
        System.out.print("After multiplication of two fractions: ");
        f1.print();
        // Fraction f3=Fraction.add(f1,f2);
        // f3.print();
    }
}
