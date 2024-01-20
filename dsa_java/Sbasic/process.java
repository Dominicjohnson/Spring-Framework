/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author m
 */
public class process {
    public static void main(String[] args) {
        
        ApplicationContext act=new ClassPathXmlApplicationContext("Employee/bean.xml");
        Emp e=(Emp) act.getBean("obj");
        System.err.println(e.getId()+e.getName()+e.getCity());
    }
}
