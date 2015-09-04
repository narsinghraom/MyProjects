//declare a one package(i,e bean)
package bean;
//class name
public class RegBean {
	//all variables are make a private and string datatypes
	private String Name;
	private String Eid;
	private String Dob;
	private String Email;
	private String BloodGroup;
	private long MoblieNo;
    private long MoblieNo1;
	//setter method
	public void setName(String Name)
	{
		this.Name=Name;
	}
	//setter method
	public void setEid(String Eid)
	{
		this.Eid=Eid;
	}
	//setter method
	public void setDob(String Dob)
	{
		this.Dob=Dob;
	}
	//setter method
	public void setEmail(String Email)
	{
		this.Email=Email;
	}
	//setter method
	public void setBloodGroup(String BloodGroup)
	{
		this.BloodGroup=BloodGroup;
	}
	public void setMoblieNo(long MoblieNo)
		{
		this.MoblieNo=MoblieNo;
	}
	public void setMoblieNo1(long MoblieNo1)
	{		this.MoblieNo1=MoblieNo1;
	}
  //getter method
  public String getName()
  {
	  return Name;
  }
  //getter method with string type
  public String getEid()
  {
	  return Eid;
  }
//getter method with string type
  public String getDob()
  {
	  return Dob;
  }
//getter method with string type
  public String getEmail()
  {
	  return Email;
  }
//getter method with string type
  public String getBloodGroup()
  {
	  return BloodGroup;
  }
  public long getMoblieNo()
  {
	return MoblieNo;
  }
public long getMoblieNo1()
{
	return MoblieNo1;
}
}//main
