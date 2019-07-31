/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Emp_tech_details;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author scit
 */
public class Emp_Show 
{
    public static void main(String arg[])
    {
        Configuration config=new Configuration();
        config.configure("resources/employee.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        
        Session ses=sf.openSession();
        
        Query qr=ses.createQuery("from Emp_tech_details");
        
        List lt=qr.list();
        
        Iterator it=lt.iterator();
        
        while(it.hasNext())
        {
            Object ob=it.next();
            Emp_tech_details e1=(Emp_tech_details)ob;
            
            System.out.println("Id:"+e1.getId());
            System.out.println("Name:"+e1.getName());
            System.out.println("City:"+e1.getCity());
            System.out.println("Address:"+e1.getAddress());
            System.out.println("Mob:"+e1.getMob());
            System.out.println("Desig:"+e1.getDesig());
            System.out.println("Qalification:"+e1.getQualif());
            System.out.println("Exp:"+e1.getExp());
            System.out.println("Salary:"+e1.getSalary());
            
        }
        
       
        
        
    }
    
}
