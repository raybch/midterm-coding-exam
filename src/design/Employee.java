package src.design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();

	public int employeeCnic();

	public String employeeCountry();

	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public String assignDepartment();
	
	//calculate employee salary
	public double calculateSalary();
	
	//employee benefit
	public int benefitLayout();


	// employee total holidays
	public int totalPTO();

	//assignTask() will assign employee a task
	public String assignTask();




}
