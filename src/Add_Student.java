import java.sql.*;
import java.util.Scanner;

public class Add_Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Connection con = DBConnection.getConnection();
            System.out.print("Enter the Name: ");
            String name = input.nextLine();
            System.out.print("Enter the Age: ");
            float age = input.nextFloat();
            input.nextLine();
            System.out.print("Enter the course: ");
            String course = input.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student_DB(name, age, course) VALUES(?,?,?)");
            ps.setString(1, name); 
            ps.setFloat(2, age);  
            ps.setString(3, course); 
            ps.executeUpdate();
            System.out.println("Insert successfull !");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
