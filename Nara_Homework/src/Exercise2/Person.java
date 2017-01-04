package Homework2;
/**
*
* @author Heng Sovannara
*/
import java.sql.Date;

public class Person extends DCommon{
	
	public String birthDate;
	public String lastName;
	public String firstName;
	
	public String getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(String birthDate)
	{
		this.birthDate = birthDate;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
