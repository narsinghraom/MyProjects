package dao;
import java.sql.*;
import java.util.Scanner;
public class DatabaseOperation 
{
  Connection con=null;
  ResultSet re=null;
public DatabaseOperation() {
	try
	{
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carzz", "root", "root");
	}catch(Exception e){
		
	}
}
    //String driver_Name="com.msql.jdbc.Driver";
    public void db()
    {
    	try
    	{
    	
    	Statement stmt=con.createStatement();
    	ResultSet re=stmt.executeQuery("select * from emp");
    	while(re.next())
    	System.out.println(re.getString(1)+" "+ re.getString(2)+ " "+re.getString(3)+" "+re.getString(4));
    	con.close();
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    }
    public void insert()
    {
    	try
    	{
    		
    	
    	String eid;
    	String ename;
    	String dob;
    	String email;
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter the EID");
    	 eid=input.next();
    	System.out.println("Enter the ENAME");
    	 ename=input.next();
    	System.out.println("Enter the DOB");
    	 dob=input.next();
    	System.out.println("Enter the Email");
        email=input.next();
        System.out.println("exist");
    	PreparedStatement pre=con.prepareStatement("insert into emp values(?,?,?,?)");
    	pre.setString(1, eid);
    	pre.setString(2, ename);
    	pre.setString(3, dob);
    	pre.setString(4, email);
    	int i=pre.executeUpdate();
    	
    	System.out.println(i+ "record is insert ");
         
    	}catch(Exception e)
    	{
    	}
    }
    public static void main(String[] s)
    {
    	DatabaseOperation dbo=new DatabaseOperation();
    	//dbo.db();
    	dbo.insert();
    }
}
