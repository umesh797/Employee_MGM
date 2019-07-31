/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Emp_per_details;
import bean.Emp_tech_details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author scit
 */
public class Emp_Process 
{
    public static void main(String arg[])
    {
        Configuration config=new Configuration();
        config.configure("resources/employee.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        
        Session ses=sf.openSession();
        
       
        
        
        
        Emp_tech_details e1=new Emp_tech_details();
        
        e1.setName("Tammana");
        e1.setAge(24);
        e1.setMob("9844069967");
        e1.setCity("Bangalore");
        e1.setAddress("Kammanahalli");
        e1.setDesig("Programmer");
        e1.setSalary(29000);
        e1.setExp(6);
        e1.setQualif("MCA");
        
        Transaction tr=ses.beginTransaction();
        
        ses.save(e1);
        
        
        tr.commit();
        
        System.out.println("Data Saves...");
        
        
        
        
    }
    
}
