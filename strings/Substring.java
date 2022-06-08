package strings;

public class Substring {
    public static void main(String[] args) {
        String str1="Everyone";
        System.out.println(str1.substring(1)); //1st index to onwards upto length of string
        System.out.println(str1.substring(8)); //return an empty string

        System.out.println(str1.substring(1,5));
        // System.out.println(str1.substring(1,9)); //through an error
        
    }
}
