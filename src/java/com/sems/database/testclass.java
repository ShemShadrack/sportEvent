/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sems.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author okech
 */
public class testclass {
    
    public static void main(String[]args){
     
        System.out.println(DBOperations.getConnection());
    }


    
}
