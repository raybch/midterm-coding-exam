package src.design;

import java.util.Scanner;

public class EmployeeInfo implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	Scanner sc  = new Scanner(System.in);
	Employees employees = new Employees();

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	static String country = "UK";
	final int cnic = 2142342534;

	int employeeId;
	String employeeName;

	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
       this.employeeName = name;
	   this.employeeId = employeeId;
	}

	public EmployeeInfo() {

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public int calculateEmployeeBonus(int numberOfYearsWithCompany , String performance ){
		int total=0;

		System.out.print("Enter annual Salary of Employee: ");
		int employee_salary = sc.nextInt();

		if(performance == "average" && employee_salary > 100000 ){
			total = employee_salary + ((employee_salary * 100) / 8);

		}else if(performance == "best" && employee_salary > 100000) {
			total = employee_salary + ((employee_salary * 100) / 10);
		}
		else if(performance == "belowaverage" && employee_salary > 100000 ) {
			total = employee_salary + ((employee_salary * 100) / 5) ;
		}
		else if(performance == "low" && employee_salary > 100000) {
			total = employee_salary;
		}else{
			total = employee_salary;
		}



		return total;

	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension() throws IllegalArgumentException{
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		System.out.println("Enter employee current monthly salary");
		Integer currentSalary = sc.nextInt();

        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);


        //implement numbers of year from above two dates
		String [] convertedJoiningDateSplit  = convertedJoiningDate.split("/");
		String [] convertedTodaysDateSplit  = convertedTodaysDate.split("/");

		int difference = Integer. parseInt(convertedTodaysDateSplit[1]) - Integer.parseInt(convertedJoiningDateSplit[1]);

		//Calculate pension
		if (difference == 1){
           total =  currentSalary * 100/5;
		}
		else if (difference == 2){
			total =  currentSalary * 100/10;
		}
		else if (difference == 3){
			total =  currentSalary * 100/15;
		}else if(difference == 4){
			total =  currentSalary * 100/20;
		}
		else if(difference == 5){
			total =  currentSalary * 100/25;
		} else if (difference == 0) {
			total = currentSalary;
		}else{
			total = currentSalary;
		}
		// and so on

		return total;
	}



	@Override
	public int employeeId() {
		System.out.println("Enter Employee Id ");
		int employeeId = sc.nextInt();
		employees.setEmployeeId(employeeId);
		return employees.getEmployeeId();
	}

	@Override
	public int employeeCnic() {
		employees.setEmployeeCnic(this.cnic);
		return employees.getEmployeeCnic();
	}

	@Override
	public  String employeeCountry() {
		employees.setEmployeeCountry(EmployeeInfo.country);
		return employees.getEmployeeCountry();
	}

	@Override
	public String employeeName() {
		System.out.println("Enter Employee Name ");
		String employeeName = sc.nextLine();
		employees.setEmployeeName(employeeName);

		return employees.getEmployeeName();
	}

	@Override
	public String assignDepartment() {
		System.out.println("Assign Department to Employee");
		String employeeDepartment = sc.nextLine();
		employees.setEmployeeDepartment(employeeDepartment);
		return  employees.getEmployeeDepartment();

	}

	@Override
	public double calculateSalary() {
		double gs,it,pt,pf,netSalary;
		System.out.println("enter Gross salary");
		gs=sc.nextDouble();
		System.out.println("enter Income Tax %");
		it=sc.nextDouble();
		System.out.println("enter Professional Tax %");
		pt=sc.nextDouble();
		System.out.println("enter Provident Fund %");
		pf=sc.nextDouble();
		pf=pf*(gs/100);
		it=it*(gs/100);
		pt=pt*(gs/100);
		netSalary=gs-it-pt-pf;
		return netSalary;
	}

	@Override
	public int benefitLayout() {
	 int total= 0;
     System.out.print("Employee PF is ");
	 int pf = sc.nextInt();
	 System.out.print("Employee Gratuity is ");
	 int gf = sc.nextInt();
	 System.out.print("Employee Health benefit is ");
	 int hb = sc.nextInt();

	 total= pf + gf + hb;

	 return total;

	}

	@Override
	public int totalPTO() {
		System.out.println("Enter Employee PTO's");
		int employeePTO = sc.nextInt();
		employees.setTotalPTO(employeePTO);
		return employees.getTotalPTO();
	}

	@Override
	public String assignTask() {
		System.out.println("Assign Task to Employee");
		String employeeTask = sc.nextLine();
		employees.setEmployeeTask(employeeTask);
		return employees.getEmployeeTask();
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
