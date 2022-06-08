package strings;

public class SomeBasicFunction {
    public static void main(String[] args) {
        String str1="Coding";
        String str2=" is fun";
        String str3="Coding";
        //concatination
         String str4=str1+str2;
         System.out.println(str4);
         System.out.println(str1.concat(str3));

         //compare string
         System.out.println(str1.equals(str3));
         System.out.println(str2.equals(str3));

         //compareTo
         System.out.println(str1.compareTo(str3));
         System.out.println(str1.compareTo(str2));

         //contains
         System.out.println(str1.contains("ing"));
         
    }
}
