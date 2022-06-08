package fundamental;

public class TypeConversion {
    public static void main(String[] args) {
        int i='c';
        System.out.println(i);
        char ch='a';
        int j=ch; //implicit conversion
        ch=(char)j;//explicit conversion  
        
        ch=(char)(ch+1); //explicit conversion
        System.out.println(j);
        System.out.println(ch);
        System.out.println(4+4.5);
        System.out.println(4.2+4.3);

        // float f=1.8; through an error (Automatically(implicit) conversion)
        float f=(float)1.8; //explicit conversion
        System.out.println(f);

    }
}
