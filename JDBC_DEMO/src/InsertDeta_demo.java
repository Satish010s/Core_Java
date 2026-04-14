import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDeta_demo {
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
            String sql="insert into Course values ('SU023','Digital Electronic','Core_Digital',250,'Offline','Subhay')";
            int res=stm.executeUpdate(sql);
            System.out.println("Query updated Successfully "+res);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
