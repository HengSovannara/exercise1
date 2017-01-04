package Homework2;
/**
*
* @author Heng Sovannara
*/
public class Developer extends Employee {
	
	public String comment;
	
	public String getComment()
	{
		return comment;
	}
	public void setComment(String comment)
	{
		this.comment=comment;
	}
	public Developer(){}
	
	public Developer(Employee em)
	{
		this.firstName=em.getfirstName();
		this.lastName=em.getlastName();
		this.birthDate=em.getbirthDate();
		this.salary=em.getSalary();
		this.year=em.getYear();
		this.holiday=em.getHoliday();
	}
	@Override
	public String getDataView()
	{
		String dev = "";
		dev +="-----------Developer_Block-------------"+"\n";
		dev +="Fullname of Developer:	"+getfirstName()+" "+getlastName()+"\n";
		dev +="Comment				:	"+getComment()+"\n";
		dev +="Salary				:	"+getSalary()+"\n";
		dev +="-----------Developer_End-------------"+"\n";
		
	return dev; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
