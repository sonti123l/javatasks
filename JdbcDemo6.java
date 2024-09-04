import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class DAO{
    Connection con;
    DAO()throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loaded");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","leela");
    }
    void insert(int eno,String ename)throws SQLException
    {
        Statement stmt=con.createStatement();
        int r=stmt.executeUpdate("insert into emp values("+eno+",'"+ename+"')");
        if(r==1)
        System.out.println("inserted");
        else
        System.out.println("Insertion failed");
    }
    void updateName(int eno,String ename)throws SQLException
    {
        String cmd="Update emp set +ename+=? where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setString(1,ename);
        pstmt.setInt(2,eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("Update.....name");
        else
        System.out.println("not updated");

    }
    void deleteEmp(int eno)throws SQLException{
        String cmd="delete from emp where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setInt(1,eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("Deleted");
        else
        System.out.println("failed delete...");
    }
    void viewAll()throws SQLException
    {
        String cmd="select *from emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(cmd);
        while(rs.next())
        {
            System.err.printf("%-5d %-30s %n",rs.getInt("eno"),rs.getString("ename"));
        }
    }    
}
public class JdbcDemo6
{
    public static void main (String[] args)throws ClassNotFoundException,SQLException
    {
        DAO o1=new DAO();
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        int n,eno;
        String ename;
        while (true) { 
            System.err.println("Enter 0.exit 1.insert 2.updateName 3.deleteEmp 4.viewAll ");
            n=s.nextInt();
            switch(n){
                case 0:System.exit(0);
                break;
                case 1:System.err.println("Enter data to be inserted:");
                    eno=s.nextInt();
                    ename=s.next();
                    o1.insert(eno, ename);
                    break;
                case 2:System.err.println("Enter data to be updated:");
                    eno=s.nextInt();
                    ename=s.next();
                    o1.updateName(eno, ename);
                    break;
                case 3:System.err.println("Enter data to be deleted");
                    eno=s.nextInt();
                    o1.deleteEmp(eno);
                    break;
                case 4:System.err.println("The data is");
                    o1.viewAll();
                    break;
            }
        }
    }
}