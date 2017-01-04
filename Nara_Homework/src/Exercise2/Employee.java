package Homework2;
/**
*
* @author Heng Sovannara
*/
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Employee implements View {
	
	public float salary;
	public int holiday;
	public int year;
	public String lastName;
	public String firstName;
	public String birthDate;
	
	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public int getHoliday()
	{
		return holiday;
	}
	public void setHoliday(int holiday)
	{
		this.holiday=holiday;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getbirthDate()
	{
		return birthDate;
	}
	public void setbirthDate(String birthDate)
	{
		this.birthDate=birthDate;
	}
	@Override
	public String getDataView() {
		
		String emp = "";
			
		emp +="------------Employee_Block------------"+"\n";
		emp +="FirstName:	"+getfirstName()+"\n";
		emp +="LastName:	"+getlastName()+"\n";
		emp +="BirthDate:	"+getbirthDate()+"\n";
		emp +="Salary:		"+getSalary()+"$"+"\n";
		emp +="Period:		"+getYear()+"years"+"\n";
		emp +="Holiday:		"+getHoliday()+"days"+"\n";
		emp +="------------Employee_End------------"+"\n";
		
		return emp;
		
	}
	
	public static void main(String[] args) {
		/* Employee e = new Employee();
		List<String> em = new ArrayList<String>();		
		em.get(e.setSalary(100));
		em.get(e.setYear(1990));
		em.get(e.setHoliday(18));
		//e.setYear(01-01-2909);
		//e.setHoliday(18);
		System.out.println(em);
		} */
}
}