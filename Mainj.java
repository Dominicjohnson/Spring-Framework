/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprintj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author m
 */
public class Mainj {
    public static void main(String[] args) {
        
    
    ApplicationContext ap=new ClassPathXmlApplicationContext("Beans//bean.xml");
    Getterj G=(Getterj) ap.getBean("obj");
    G.show();
    }
            }
