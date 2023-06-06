package com.test;

import com.dao.HBdao;
import com.model.Department;
import com.model.Employee;

public class Test 
{
  public static void main(String[] args) {
	 HBdao dao = new HBdao();
	 Department d1 = new Department();
	 d1.setDname("IT Department");
	 dao.addDepartment(d1);
	 
	 Employee e1 = new Employee();
	 e1.setCity("Bhopal");
	 e1.setEname("Viraaj");
	 e1.setDept(d1);
	 dao.addEmployee(e1);
	 
	 Employee e2 = new Employee();
	 e2.setCity("Indore");
	 e2.setEname("Rohit");
	 e2.setDept(d1);
	 dao.addEmployee(e2 );
	 
	 }
}
