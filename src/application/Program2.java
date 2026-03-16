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
		
		sc.close();
	}
	
}
