package src.design;

import org.junit.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


        // Unit Testing of Employees Class Getter/Setter methods
        Employees e = new Employees();
        e.setEmployeeId(1);
        try {
            Assert.assertEquals(1,e.getEmployeeId());
        }catch(Exception ex){
            ex.getMessage();
        }
        e.setEmployeeName("adam");
        try {
            Assert.assertEquals("adam",e.getEmployeeName());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeCountry("UK");
        try {
            Assert.assertEquals("UK",e.getEmployeeCountry());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeCnic(2142342534);
        try {
            Assert.assertEquals(2142342534,e.getEmployeeCountry());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeDepartment("Software");
        try {
            Assert.assertEquals("Software",e.getEmployeeDepartment());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeBenefit(30000);
        try {
            Assert.assertEquals(30000,e.getEmployeeBenefit());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeBonus(2300);
        try {
            Assert.assertEquals(2300,e.getEmployeeBonus());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setTotalPTO(4);
        try {
            Assert.assertEquals(4,e.getTotalPTO());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeTask("bug fix");
        try {
            Assert.assertEquals("bug fix",e.getEmployeeTask());
        }catch(Exception ex){
            ex.getMessage();
        }

        e.setEmployeeSalary(300000);
        try {
            Assert.assertEquals(300000,e.getEmployeeSalary());
        }catch(Exception ex){
            ex.getMessage();
        }

        // Same Negative Unit testing

        EmployeeInfo employee = new EmployeeInfo();

        try {
            Assert.assertEquals(300000, employee.calculateSalary());
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(4500, employee.benefitLayout());
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(5789, employee.calculateEmployeeBonus(2,"average"));
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}
