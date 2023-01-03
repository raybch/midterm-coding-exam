package src.design;

import src.databases.ConnectToSqlDB;

import java.util.List;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
       EmployeeInfo employeeInfo = new EmployeeInfo();
	   Employees employees = new Employees();

	   String employeeName=employeeInfo.employeeName();
	   employees.setEmployeeName(employeeName);

	   int employeeCnic =employeeInfo.employeeCnic();
	   employees.setEmployeeCnic(employeeCnic);

	   String employeeCountry = employeeInfo.employeeCountry();
	   employees.setEmployeeCountry(employeeCountry);

	   String employeeDepartment=employeeInfo.assignDepartment();
	   employees.setEmployeeDepartment(employeeDepartment);

	   String employeeTask= employeeInfo.assignTask();
	   employees.setEmployeeTask(employeeTask);

	   int employeePto= employeeInfo.totalPTO();
	   employees.setTotalPTO(employeePto);

	   double employeeSalray= employeeInfo.calculateSalary();
	   employees.setEmployeeSalary(employeeSalray);

	   int employeeBonus=employeeInfo.calculateEmployeeBonus(2,"average");
	   employees.setEmployeeBonus(employeeBonus);

	   int employeebenefit=employeeInfo.benefitLayout();
	   employees.setEmployeeBenefit(employeebenefit);

		//Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertEmployeeDatatoDatabase("employee","employee_name","employee_cnic","employee_country","employee_department","employee_task","employee_pto","employee_salary","employee_bonus","employee_benefit",employees);

        // retrieve data
		try {
			List<String> data= connectToSqlDB.readDataBase("employee","employee_id");
			System.out.print(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
