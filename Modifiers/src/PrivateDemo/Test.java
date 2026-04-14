package PrivateDemo;
  class Student {
    private int pin=844122;

    private void ShowPin(){
        System.out.println("pin is :"+pin);
    }
    void verify(){
        ShowPin();
    }
}
public class Test {
    static void main(String[] args) {
        Student s=new Student();
       // System.out.println(s.pin);  //error
     //   s.ShowPin();  ->error
        s.verify();
    }
}
