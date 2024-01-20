/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Springjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author m
 */
public class Mainc {
    public static void main(String[] args) {
        
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans/bean.xml");
        Listc l=(Listc) a.getBean("obj");
        l.view();
    }
}
