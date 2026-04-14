public class Instance {
    public static void main(String[] args) {
        Employee e2=new Employee();  // Creating an object of Employee
        e2.DisplayEplmoyee();    //Accessing method of employee
        /*before initialisation of instance variable the output will be -->>
                  0
                  null   */

         /*After  initialisation of instance variable the output will be -->>
                 24431
                 Satish Kumar
                                 */

    }
}
