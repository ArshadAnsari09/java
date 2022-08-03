package oops.constructor;

public class StaticKeyword {
    public static void main(String[] args) {
            Student s1=new Student("Arshad");
          //   s1.print();
            Student s2=new Student("Ansari");
          //   s2.print();
    
          //not a correct way of access a static variable as it belongs to class
          System.out.println(s1.getNumStudent());
          System.out.println(s2.getNumStudent());
    
          //correct way to access a static variable
          System.out.println(Student.getNumStudent());

    }
}
