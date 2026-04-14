package Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Raju r=new Raju();
        r.print();
        r.gold();
        r.daimond();
        System.out.println(r.khet);
        Papa p=new Papa();
       // p.diamond();--->> Parent class cannot access the child class field and function
       Priya t=new Priya();
       t.daimond();  //single level inheritance
       p.plot(); //from grand parent class
       p.gold();
    }
}
