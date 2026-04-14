public class PropagationDemo {
    static int method2(int a,int b){
        int c=a/b;
        return c;
    }
    static void method1(){
        int r=method2(10,0);
        System.out.println(r);
    }
    public static void main (String[] args) {
        try {

            method1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
