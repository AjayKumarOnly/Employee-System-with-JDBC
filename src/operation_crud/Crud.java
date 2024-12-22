package operation_crud;

import java.sql.*;

public class Crud {
    private static final String url ="jdbc:mysql://localhost:3306/tony";
    private  static final String username = "root";
    private static final String password = "";
    public  void updateName(int id, String name) throws Exception{
        String sql = "update emp set name = ? where id = ?";


        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,name);
        pst.setInt(2,id);

        int rs = pst.executeUpdate();
        System.out.println("Number of rows Updated : "+ rs);
        pst.close();
        con.close();
    }
    public  void readRecords() throws Exception{
        String sql = "select * from emp";


        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println("Id : " + rs.getInt(1));
            System.out.println("Name : " + rs.getString(2));
            System.out.println("Salary : " + rs.getInt(3));
        }
        con.close();
    }
    public   void insertRecord(int id,String name,int salary) throws Exception{
        String sql = "insert into emp values(?,?,?)";



        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,salary);

        int rs = pst.executeUpdate();
        System.out.println("Number of rows Affected : "+ rs);
        pst.close();
        con.close();
    }
    public  void deleteRecord(int id) throws Exception{
        String sql = "delete from emp where id = ?";


        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);

        int rs = pst.executeUpdate();
        System.out.println("Number of rows Deleted : "+ rs);
        pst.close();
        con.close();
    }
    public  void updateSalary(int id,int upSalary)throws Exception{
        String sql = "update emp set salary = ? where id = ?";


        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,upSalary);
        pst.setInt(2,id);

        int rs = pst.executeUpdate();
        System.out.println("Number of rows Updated : "+ rs);
        pst.close();
        con.close();
    }
}
