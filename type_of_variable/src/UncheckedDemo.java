import java.io.FileInputStream;

public class UncheckedDemo {
    static void fun1() throws Exception{
        FileInputStream file=new FileInputStream("BPMCE.TxT");
    }
    static  void fun2() throws Exception{
        fun1();
    }
    static  void fun3() throws Exception{
        fun2();
    }

    public static void main(String[] args) throws Exception {
            fun3();;
    }
}
