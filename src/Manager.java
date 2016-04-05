import java.util.ArrayList;

public class Manager implements Employee{
	private int ID;
	private String fName;
	private String lName;
	private String jobDescription;
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Manager(int ID, String fName, String lName, String jobDescription) {
		this.ID = ID;
		this.fName = fName;
		this.lName = lName;
		this.jobDescription = jobDescription;
	}
	
	
	@Override
	public String getEmployeeInfo() {
		String str = "EmployeeID: " + ID + " First Name: " + fName + " Last Name: " + 
	lName + " jobDescription: " + jobDescription;
		return str;	
	}
	
	public void displayManagementInfo() {
		for (Employee e : employees) {
			System.out.println(e.getEmployeeInfo());
			if (e instanceof Manager){
				((Manager) e).displayManagementInfo();
			}	
		}
	}
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public boolean removeEmployee(Employee e){
		return employees.remove(e);
	}
	
	
	
	//getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

}
