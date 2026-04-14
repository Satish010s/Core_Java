import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData_Demo {
    public static void main(String[] args) {
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/satish",
                    "root",
                    "Satish@2006"
            );
            Statement stm=con.createStatement();
            String sql="DELETE FROM Course where course_id='SU023'";
            int res=stm.executeUpdate(sql);
            if(res>0) {
                System.out.println("Query  deleted Successfully " );
            }
            else{
                System.out.println("Not deleted");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
