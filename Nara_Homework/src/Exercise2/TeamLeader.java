package Homework2;
/**
*
* @author Heng Sovannara
*/
public class TeamLeader extends Employee implements View {

	public int projectNum;
	
	public int getprojectNum()
	{
		return projectNum;
	}
	public void setprojectNum(int projectNum)
	{
		this.projectNum = projectNum;
	}
@Override
public String getDataView()
{
	String team = "";
	
	team += "--------TeamLeader_Block---------"+"\n";
	team += "FullName:		"+getfirstName().toUpperCase()+" "+getlastName().toUpperCase()+"\n";
	team += "ProjectNum:		"+getprojectNum()+"\n";
	team += "--------TeamLeader_End---------"+"\n";
	return team; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
