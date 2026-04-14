public class factorial {
    public static void main(String[] args) {
        int Factorial=fact(5);
        System.out.println(Factorial);
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
