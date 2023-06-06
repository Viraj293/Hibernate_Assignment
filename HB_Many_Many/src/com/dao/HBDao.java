package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Students;
import com.model.Subjects;
import com.util.HButil;

public class HBDao 
{
   Session session = null;
   Transaction tx = null;
   public void addSubjects(Subjects s1)
   {
	   session=new HButil().getsessionData();
	   tx=session.beginTransaction();
	   session.save(s1);
	   tx.commit();
	   session.close();
	   System.out.println("Subject record inserted ");
   }
   public void addStudents(Students ss1)
   {
	   session=new HButil().getsessionData();
	   tx=session.beginTransaction();
	   session.save(ss1);
	   tx.commit();
	   session.close();
	   System.out.println("Students record inserted ");
   }
}
