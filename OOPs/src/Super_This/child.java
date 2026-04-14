package Super_This;

import java.util.Locale;

class Parent {
    String name;
    void details(){
        System.out.println(name.toUpperCase());
    }
}
public class child extends Parent {
    String name;
    public void details(){
    super.name="Parent";    //---->> The key  (super) is used to update or access the data of parent class means the Base class
    this.name="Satish";     //---->>The key  (this) is used to access or update the data of same class means the child class
        System.out.println(super.name +" and "+this.name);
        super.details();  // Accessing the method of parent class
    }

    public static void main(String[] args) {
        child C=new child();
        C.details();
    }
}

