package oops.complexNumber;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public void setReal(int num){
        this.real=num;
    }

    public int getReal(){
        return real;
    }

    public void setImaginary(int num){
        this.imaginary=num;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void add(ComplexNumber c2){
        this.real=this.real + c2.real;
        this.imaginary=this.imaginary + c2.imaginary;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newReal=c1.real + c2.real;
        int newImag=c1.imaginary + c2.imaginary;
        ComplexNumber c4= new ComplexNumber(newReal, newImag);
        return c4;
    }

    public void multiply(ComplexNumber c2){
        this.real=(this.real * c2.real) - (this.imaginary * c2.imaginary);
        this.imaginary=(this.real + c2.imaginary) + (this.imaginary * c2.real);
    }

    public void print(){
        System.out.println(this.real+ " + i"+this.imaginary);
    }
}
