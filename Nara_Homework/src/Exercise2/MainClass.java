package Homework2;
/**
*
* @author Heng Sovannara
*/
import java.util.ArrayList;
import java.util.List;

public class MainClass{

	public static void main(String[] args) {
		
		List<Employee> str = new ArrayList<Employee>();
		
		Employee emp = new Employee();// Create object of Employee
		emp.setfirstName("Heng");
		emp.setlastName("Sovannara");
		emp.setSalary(250);
		emp.setbirthDate("01-01-1990");
		emp.setHoliday(18);
		emp.setYear(4);
		
		str.add(emp);//Insert into ArrayList
		
		Developer dev = new Developer(emp);//Create object of Developer
		dev.setComment("Staff of BTU");
		
		str.add(dev);//Insert into ArrayList
		
		TeamLeader team = new TeamLeader(); //Create object of TeamLeader
		team.setprojectNum(001);
		team.setfirstName("Heng");
		team.setlastName("Sovannara");
		str.add(team);
		
		for(Employee em: str) // Get
		{
			System.out.println(em.getDataView()+"\n");
		}		
		}
	}


