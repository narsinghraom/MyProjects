package dao;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import bean.RegBean;

public class DataBaseOperations
{	
	PreparedStatement ps = null;
	ResultSet re = null;
	Connection con = null;
    //create a constructor
	public DataBaseOperations() {

		try {//try block to avoid the Exceptions
			Class.forName("com.mysql.jdbc.Driver");//mysql driver name
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dhatridb", "root", "root");//mysql connections

		} catch (Exception e) {
			System.out.println(e);
		}

	}
    //creating a method with the name of insertReg
	public void insertReg(RegBean bean) throws IOException, SQLException {
		try {
			String query = "insert into emp values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(query);//getting all parameter
			ps.setString(1, bean.getEid());//1 specify first parameter in the query (ie;Eid)
			ps.setString(2, bean.getName());//2 specify first parameter in the query
			ps.setString(3, bean.getDob());//3 specify first parameter in the query
			ps.setString(4, bean.getEmail());//4 specify first parameter in the query
			ps.setString(5, bean.getBloodGroup());//5 specify first parameter in the query
			ps.setLong(6, bean.getMoblieNo());
			ps.setLong(7, bean.getMoblieNo1());
			int val = ps.executeUpdate();//execute query for the which insert parameters
			System.out.println(val + " inserted");
		} catch (SQLException se) {
			System.out.println(se);
		}

		finally {//final block to avoid the exceptions
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
//creating one method for the get all the EidDetails 
	public ArrayList<RegBean> getEidDetail() {//ArrayList for a make a insertion order
		ArrayList<RegBean> arrayobj = null;
		try {
			//Create the object of arrayList
			arrayobj = new ArrayList<RegBean>();
			ps = con.prepareStatement("select * from emp");
			re = ps.executeQuery();
			RegBean rb;
			while (re.next()) {
				rb = new RegBean();
				rb.setEid(re.getString(1));
				arrayobj.add(rb);
			}
		}

		catch (Exception e) {
			
			System.out.println(e);

		} finally {
			try {
				// re.close();
				ps.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		return arrayobj;
	}

	public  ArrayList<RegBean> allDetails(String Eid) {
		ArrayList<RegBean> arrayobj1 = null;
		try {
			RegBean bean;
			bean = new RegBean();
			bean.setEid(Eid);

			arrayobj1 = new ArrayList<RegBean>();
			ps = con.prepareStatement("select * from emp where eid=?");
			ps.setString(1, bean.getEid());
			re = ps.executeQuery();
			
			while (re.next())
				
			{
				bean = new RegBean();
				bean.setName(re.getString(2));
				bean.setDob(re.getString(3));
				bean.setEmail(re.getString(4));
				bean.setBloodGroup(re.getString(5));
				bean.setMoblieNo(re.getInt(6));
				bean.setMoblieNo1(re.getInt(7));

				arrayobj1.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// re.close();
				ps.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		return arrayobj1;
	}
	

public ArrayList<RegBean> getSearchBloodGroup(String BloodGroup) throws IOException, SQLException
{
	
	System.out.println("method started");
	ArrayList<RegBean> arraybean = null;
try
{
	RegBean bean=new RegBean();
	bean.setBloodGroup(BloodGroup);
	
	arraybean = new ArrayList<RegBean>();
	ps = con.prepareStatement("select * from emp where bloodgrop=?");
	ps.setString(1,bean.getBloodGroup());
	re=ps.executeQuery();
	while(re.next())
	{
		bean.setEid(re.getString(1));
		bean.setName(re.getString(2));
		bean.setDob(re.getString(3));
		bean.setEmail(re.getString(4));
		bean.setBloodGroup(re.getString(5));
		bean.setMoblieNo(re.getLong(6));
		bean.setMoblieNo1(re.getLong(7));
		
		arraybean.add(bean);
		
	}
}
finally
{
	try{
	
	ps.close();
		con.close();
	
}catch(Exception e)
{
	System.out.println(e);
}
}
return arraybean;
}



}
// public static void main(String[] args) {
// DataBaseOperations db=new DataBaseOperations();
// RegBean bean=new RegBean();
// bean.setName("van");
// bean.setEid("ds-101");
// bean.setDob("12-10-90");
// bean.setEmail("van@gamil.com");
// bean.setBloodGroup("o+ve");
// try
// {
// db.insertReg(bean);
// }
// catch(Exception se)
// {
// System.out.println(se);
// }
// }

