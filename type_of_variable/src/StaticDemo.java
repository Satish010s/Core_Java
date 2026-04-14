public class StaticDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Display();
        System.out.println(s1);

        Student s2=new Student();
        s2.collegename="Bihar engineering university";
        s2.Display();
        System.out.println(s2);
        System.out.print("-----------------------------\n");
        s1.Display();

        /* important points for static variable

       -->>>it belong to class
       -->>>only one copy shared among all objects
       --->>Stored in method area

         */

    }
}
