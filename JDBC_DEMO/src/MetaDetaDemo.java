import java.sql.*;

public class MetaDetaDemo {
    public static void main(String[] args) {
        try{
            //load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Get connection
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/satish",
                    "root",
                    "Satish@2006"
            );
            //------------------------------------------------------
            // Part 1 DatabaseMetaData (Information about deta)
            //-----------------------------------------------------

            DatabaseMetaData metada=con.getMetaData();
            System.out.println("------Database Information----");
            System.out.println("Driver name -> "+metada.getDriverName());
            System.out.println("Driver Username -> "+metada.getUserName());
            System.out.println("Driver url -> "+metada.getURL());
            System.out.println("Driver Driver Version -> "+metada.getDriverVersion());
            Statement stm= con.createStatement();
            ResultSet rs=stm.executeQuery("select *from Course");
            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("=====Table (resultset) information===");
            int countcol= rsmd.getColumnCount();
            System.out.println("Total Column: "+countcol);

            //2 What are the names and type of column
            System.out.println("==================================");
            System.out.println("Col_id  || col_name || Col_Type");
            System.out.println("==================================");

            for(int i=1;i<=countcol;i++){
                System.out.println(
                        "  "+ i +" | " + rsmd.getColumnName(i)+ " | "+ rsmd.getColumnTypeName(i)
                );
            }
            System.out.println("===================================================");
            con.close();
        }

        catch (Exception e){
                e.getStackTrace();
        }
    }
}
