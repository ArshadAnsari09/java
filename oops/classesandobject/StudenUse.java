package oops.classesandobject;

public class StudenUse {
    public static void main(String[] args) {
            // Scanner s=new Scanner(Source);
            Student s1; 
            s1=new Student();
            
            Student s2=new Student();
            System.out.println(s1);
            s1.name="Arshad";
            // s1.rollNo=05;
            System.out.println(s1.name+" "); //+s1.rollNo);
            s2.name="Ansari";
            // s2.rollNo=15;
            System.out.println(s2.name+" "); //+s2.rollNo);
    }
}
