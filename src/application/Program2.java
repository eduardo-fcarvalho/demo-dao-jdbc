package application;

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
		
		sc.close();
	}
	
}
