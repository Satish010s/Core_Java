package Abstract_Demo;

public abstract class Payment {
    int a;

    Payment()
    {
        System.out.println("constructor loading.....");
    }


    abstract void pay(); //dependent on other

    public void invoice()
    {
        System.out.println("bill generated.....");
    }
}
