import java.sql.*;
import java.util.Scanner;

public class Delete_Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Connection con = DBConnection.getConnection();
            System.out.print("Enter the ID: ");
            int id = input.nextInt();
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM student_DB WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
            System.out.println("Delete successfully!");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
