package com.util;
import java.util.Properties;


import org.hibernate.cfg.Configuration;

import com.model.Students;
import com.model.Subjects;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class HButil {
	
	
	Properties prop = null ;
	Configuration con = null ;
	SessionFactory sf = null;
	Session session = null;
	
	public Session getsessionData()
	{
		prop = new Properties();
		prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hb");
		prop.setProperty("hibernate.connection.username", "root");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.format_sql", "true");
		prop.setProperty("hibernate.show_sql", "true");
		
		con = new Configuration();
		con.addProperties(prop).addAnnotatedClass(Students.class).addAnnotatedClass(Subjects.class);
		sf = con.buildSessionFactory();
		session = sf.openSession();
		
		return session ;
	
	}
	
	

}
