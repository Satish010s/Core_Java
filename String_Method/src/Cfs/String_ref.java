package Cfs;

import java.util.StringTokenizer;

public class String_ref {
    public static void main(String[] args) {
        String s="hello";
        String  s1=new String("hello");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        // String Buffer
        //Creating StringBuffer by using new keyword
        //StringBuffer is mutable
        StringBuffer demoString = new StringBuffer("satish");
        System.out.println((demoString));
        //Changing the string literals of to StringBuffer
        demoString.append("kumar");
        System.out.print(demoString); //Output will be -> satishkumar

        //String Bulider
        //Creating StringBuilder same by using new keyword
        StringBuilder newstring = new StringBuilder("satish");
        System.out.println((newstring));
        newstring.append("kumar");
        System.out.print(newstring);

        // Creating Byte ASCII Array
        byte ascii[] = { 71, 70, 71 };

        // Creating String using byte array
        String firstString = new String(ascii);
        System.out.println(firstString);

        // Creating String using byte array with  Start index to End Index
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);
    }
}
