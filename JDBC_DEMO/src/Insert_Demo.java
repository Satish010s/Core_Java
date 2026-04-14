import java.sql.*;
import java.util.Scanner;

public class Insert_Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            Connection con= DriverManager.getConnection(DBConfig.Url,DBConfig.UserName,DBConfig.Password);
            System.out.println("Enter course_id");
            String course_id=sc.nextLine();
            System.out.println("Enter course_name");
            String course_name=sc.nextLine();
            System.out.println("Enter Domain");
            String Domain=sc.nextLine();
            System.out.println("Enter Student_Intake");
            int Student_Intake= sc.nextInt();
            System.out.println("Enter Dilivery_Mode");
            String Dilivery_Mode=sc.next();
            System.out.println("Enter Faculty");
            String Faculty=sc.next();
            String Query="insert into Course values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setString(1,course_id);
            ps.setString(2,course_name);
            ps.setString(3,Domain);
            ps.setInt(4,Student_Intake);
            ps.setString(5,Dilivery_Mode);
            ps.setString(6,Faculty);
            int res=ps.executeUpdate();
            if(res>0){
                System.out.println("Updated Successfully");
            }
            else {
                System.out.println("Not Updated");
            }
            ResultSet resultSet=ps.executeQuery("select * from Course");
            while(resultSet.next()){
                System.out.println(resultSet.getString("course_id")+" || "+resultSet.getString("course_name")+" ||  "+resultSet.getString("Domain")+" ||  "+resultSet.getInt("Student_Intake")+" || "+resultSet.getString("Dilivery_Mode")+" || "+resultSet.getString("Faculty"));
            }
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
