import java.sql.*; 

public class View_Student {
    public static void main(String[] args) {
        try {
          Connection con = DBConnection.getConnection();
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM student_DB");
          System.out.println("ID  |  Name  |  Age  |  Course  ");
          System.out.println("---------------------------------------------------------");
          while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getFloat("age") + " | " + rs.getString("course"));
          }
          con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
}
