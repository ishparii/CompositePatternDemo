public class Main {
	public static void main(String[] args) {
		Employee manager1 = new Manager(4, "Bob", "Anderson", "Manager for IT Deparment");
		Employee manager2 = new Manager(6, "Chinki", "Hay", "Manager for Project 3");
		Employee worker1 = new Worker(3, "Ilonka", "Ross", "Front end developer for Project 3");
		Employee worker2 = new Worker(7, "Annie", "Spector", "Back end developer for Project 3");
		
		((Manager)manager1).addEmployee(manager2);
		((Manager)manager2).addEmployee(worker1);
		((Manager)manager2).addEmployee(worker2);
		
		String str = manager1.getEmployeeInfo();
		System.out.println(str);
		
		((Manager)manager1).displayManagementInfo();
	}
}
