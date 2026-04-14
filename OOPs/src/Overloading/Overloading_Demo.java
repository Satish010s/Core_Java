package Overloading;

public class Overloading_Demo {
    static public int add(int a,int b){
        return a+b;
    }
    static public int add(int a,int b,int c){
        return a+b+c;
    }
    static void print(){
        System.out.println("Method overloading");
    }
    static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        int d=add(45,5);
        System.out.println(d);
        int e=add(45,23,21);
        System.out.println(e);
        print();
        print("Abb Samajh gaye");
    }
}
