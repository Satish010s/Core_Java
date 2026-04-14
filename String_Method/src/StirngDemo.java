public class StirngDemo {
    public static void main(String[] args) {
        //STRING BUFFER
        /* StringBuffer class is used to create a mutable string object
           meas it can change after it is created.

           ->>It is slower than StringBuilder
         */
        StringBuffer sb=new StringBuffer("satish");
        sb.append("yadav");
        System.out.println(sb);

        //STRING BUILDER
        /*
            Not Thread safe
            Mutable
            Fastest
         */
       StringBuilder Build=new StringBuilder("kumar");
       Build.append("code for succes");
       System.out.println(Build);
    }
}
