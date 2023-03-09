package employeemanagementsystem;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeImpl implements IEmployee {
	static Scanner sc = new Scanner(System.in);
	HashSet<Employee> setEmployees = new HashSet<>();

	Employee emp1 = new Employee(101, "Brahma", 24, "Developer", 25000);
	Employee emp2 = new Employee(102, "Shiv", 26, "Tester", 57000);
	Employee emp3 = new Employee(103, "Vishnu", 20, "DevOps Eng", 50000);
	Employee emp4 = new Employee(104, "Hanuman", 27, "System Eng", 70000);
	
	public EmployeeImpl() 
	{
		setEmployees.add(emp1);
		setEmployees.add(emp2);
		setEmployees.add(emp3);
		setEmployees.add(emp4);

	}
	
	//add emp
	@Override
	public void addEmploys() 
	{
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter Department:");
		String department = sc.next();
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, age, department, salary);

		setEmployees.add(emp);
		System.out.println(emp);
		System.out.println("Employee has been added successfully");
	}

	//view emp based on there id
	@Override
	public void viewEmp() 
	{
		boolean found = false;
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		for (Employee emp : setEmployees) 
		{
			if (emp.getId() == id) 
			{
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) 
		{
			System.out.println("Employee with this id is not present");
		}
	}

	//delete emp
	@Override
	public void deleteEmployee() 
	{
		System.out.println("Enter id");
		int id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;
		for (Employee emp : setEmployees) 
		{
			if (emp.getId() == id) 
			{
				empdelete = emp;
				found = true;
			}
		}
		if (!found) 
		{
			System.out.println("Employee is not present");
		} 
		else 
		{
			setEmployees.remove(empdelete);
			System.out.println("Employee has been deleted successfully!!");
		}
	}
	
	//view all employees
	@Override
	public void viewAllEmps() 
	{
		for (Employee emp : setEmployees) 
		{
			System.out.println(emp);
		}
	}
}
