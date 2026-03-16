package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	void main() {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		IO.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(1);
		IO.println(department);
		
		IO.println("\n=== TEST 2: department findByAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(IO::println);
		
		IO.println("\n=== TEST 3: department insert ===");
		Department newDep = new Department(null, "Games");
		departmentDao.insert(newDep);
		IO.println("Inserted! New id = " + newDep.getId());
		IO.println(newDep);
		
		IO.println("\n=== TEST 4: department update ===");
		department = departmentDao.findById(1);
		department.setName("Art");
		departmentDao.update(department);
		IO.println("Update completed");
		
		IO.println("\n=== TEST 5: department delete ===");
		IO.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		IO.println("Delete completed");
		
		sc.close();
	}
	
}
