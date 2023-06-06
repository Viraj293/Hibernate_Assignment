package com.test;

import java.util.Collection;
import java.util.HashSet;

import com.dao.HBDao;
import com.model.Students;
import com.model.Subjects;

public class Test
{
	public static void main(String[] args) 
	{
	  HBDao dao = new HBDao ();
	  Collection<Subjects> sb1=new HashSet<Subjects>();
	  
	  Subjects s1 =new Subjects();
	  s1.setSubname("Java");
	  s1.setDuration("4.5 months");
	  dao.addSubjects(s1);
	  
	  Subjects s2 =new Subjects();
	  s2.setSubname("ST");
	  s2.setDuration("5 months");
	  dao.addSubjects(s2);
      sb1.add(s1);
      sb1.add(s2);
      
      Students ss1=new Students ();
      ss1.setSname("Viraaj");
      ss1.setCity("Bhopal");
      ss1.setSubjects(sb1);
      
      dao.addStudents(ss1);
      Students ss2=new Students ();
      ss2.setSname("Shubham");
      ss2.setCity("Banglore");
      ss2.setSubjects(sb1);
      dao.addStudents(ss2);

  	}
	
	
}
