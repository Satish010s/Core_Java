package Cfs;

import ginnie.StringMethod;

import java.util.Scanner;
public class MethodDemo {
    public static void main(String[] args) {
        String s1 = "Satish";
        String s2 = "Kumar";
        //creating an object for calling Cfs.Utility method --->>Cfs.Utility m=new Cfs.Utility();
        Utility m=new Utility();
        //Accessing method form different class
        // And it will wrook same as like whem the method call in the same class
        m.stringAppend("satish","Kumar");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for calculate sum ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum is ");
        System.out.println(m.calculateSum(a,b));
        
 /* -------------------------------------------------------------------
 =====================================
 -------------------------
  */

        // Accessing package from different package
        StringMethod stringMethod=new StringMethod();
        int result=stringMethod.calculateSubtract(a,b);
        System.out.println(result);

    }

}
