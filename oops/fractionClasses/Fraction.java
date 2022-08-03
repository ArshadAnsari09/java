package oops.fractionClasses;

import oops.exception.DivideByZeroException;

public class Fraction {
    private int numerator;
    private int denominator;

    // constructor of fraction
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            // through error
            // throw new DivideByZeroException();
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // simplify Function
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    public void setNumerator(int num) {

        this.numerator = num;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int num) throws DivideByZeroException{
        if (num == 0) {
            // through error
            throw new DivideByZeroException();
            // return;
        }
        this.denominator = num;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    // to print fraction
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void addFraction(Fraction f2){
       //first fraction is the fraction on which is called 
       //second fraction is passed as arguments
       this.numerator=this.numerator * f2.denominator+this.denominator * f2.numerator;
       this.denominator=this.denominator * f2.denominator;
       simplify();
    }
     
    //subtraction function
    public void subtract(Fraction f2){
        this.numerator=this.numerator * f2.denominator - this.denominator * f2.numerator;
        this.denominator=this.denominator * f2.denominator;
        simplify();
    }

    //muliplication function
    public void multiply(Fraction f2){
        this.numerator=this.numerator * f2.numerator;
        this.denominator=this.denominator * f2.denominator;
        simplify();
    }

    //version of another add function which take both fraction and add them and return ans in 3rd fraction
    //we make it static because we don't need to use object instead using class
    public static Fraction add(Fraction f1,Fraction f2) throws DivideByZeroException{
        int newNum=f1.numerator * f2.denominator+f1.denominator * f2.numerator;
        int newDeno=f1.denominator * f2.denominator;
        Fraction f3=new Fraction(newNum, newDeno);
        return f3;   //no need to simplify it automatically called
    }

}
