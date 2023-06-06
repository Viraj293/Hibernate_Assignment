package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Employee;
import com.util.HButil;

public class HBdao
{
  Session session = null;
  Transaction tx = null ;
  public void addEmployee(Employee e1)
  {
	  session = new HButil().getsessionData();
	  tx =session.beginTransaction();
	  session.save(e1);
	  tx.commit();
	  session.close();
	  System.out.println("Employee record inserted ...");  
  }
  public void addDepartment(Department d1)
  {
	  session = new HButil().getsessionData();
	  tx =session.beginTransaction();
	  session.save(d1);
	  tx.commit();
	  session.close();
	  System.out.println("Department record inserted ...");
	  
	  
  }
}
