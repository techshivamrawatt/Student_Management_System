import java.sql.*;
import java.util.Scanner;

public class Update_Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Connection con = DBConnection.getConnection();
            System.out.print("What you want to change values in this Table.\n1.Name\n2.Age\n3.Course\nEnter choice");
            int choice = input.nextInt();
            input.nextLine();

            System.out.print("Enter the ID: ");
            int id = input.nextInt();
            input.nextLine();

            String sql = "";
            if (choice == 1) {
                System.out.print("Enter New Name: ");
                String name = input.nextLine();
                sql = "UPDATE student_DB SET name=? WHERE id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Update Name !");
                con.close();
            } else if (choice == 2) {
               System.out.print("Enter the new Age: ");
               float age = input.nextFloat();
               sql = "UPDATE student_DB SET age=? WHERE id=?";
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setFloat(1,age);
               ps.setInt(2, id);
               ps.executeUpdate();
               System.out.println("Update Age !");
               con.close();
            } else if (choice == 3) {
                System.out.print("Enter the new Course: ");
                String course = input.nextLine();
                sql = "UPDATE student_DB SET course=? WHERE id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, course);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Update Course !");
                con.close();
            } else {
                System.out.println("Please enter correct option.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}