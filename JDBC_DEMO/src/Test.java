import java.sql.*;

public class Test {
    static void main(String[] args) {
        //load driver
        //get connection
        //create statement
        //execute query
        //close connection

        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/satish",
                    "root",
                    "Satish@2006"
            );
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from Course");
            while(resultSet.next()){
                System.out.println(resultSet.getString("course_id")+" || "+resultSet.getString("course_name")+" ||  "+resultSet.getString("Domain")+" ||  "+resultSet.getInt("Student_Intake")+" || "+resultSet.getString("Dilivery_Mode")+" || "+resultSet.getString("Faculty"));
            }
            connection.close();
        }
        catch (Exception e){
              e.printStackTrace();
        }
    }
}
