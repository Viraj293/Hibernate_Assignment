package com.test;

import com.dao.HBdao;
import com.model.Employee;
import com.model.ProfileDetails;

public class Test
{
   public static void main(String[] args) 
{
    HBdao Dao = new HBdao();
    ProfileDetails p1 = new ProfileDetails();
    p1.setAddress("Kolar Road");
    p1.setDesg("Sr.Developer");
     Dao.addProfileDetails(p1);
     
     Employee e1 = new Employee();
     e1.setEname("Viraaj");
     e1.setCity("Bhopal");
     e1.setProfile(p1);
     
     Dao.addEmployee(e1);
     
}
}
