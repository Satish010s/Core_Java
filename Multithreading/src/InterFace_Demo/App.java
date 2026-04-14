package InterFace_Demo;

public class App {
    public static void main(String[] args) {
        Payment p=new CardPayment();
        p.pay();
        System.out.println(Payment.x);
    }
}
