class Tesst {
    static int area(int l, int b)  throws Exception
    {
      if(l<0||b<0) {
          throw new Exception(" negative value");
      }
          int c = l * b;
        return c;
    }

    static void method1() {
        try {
            int r = area(10, 5);
            System.out.println("The area is " + r);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        method1();
    }
}