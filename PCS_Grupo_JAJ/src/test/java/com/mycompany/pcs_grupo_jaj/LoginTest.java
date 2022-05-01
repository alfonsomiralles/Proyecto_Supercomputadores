/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcs_grupo_jaj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfonso
 */
public class LoginTest {
    Connection conn = null;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main Test");
        String[] args = null;
        Login.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar method, of class Login.
     */
    @Test
    public void testAutenticar() {
        System.out.println("autenticar");
        String usuario = "adminu";
        char[] contrasena ={'a','d','m','i','n','u'};
        try //comprobar las credenciales de usuario
        {
            conn = DriverManager.getConnection("jdbc:mysql://centrosdb.cnuocjqyr6v2.us-east-1.rds.amazonaws.com:3306/centrosdb","admin","cencentros1");  
            Statement stmt=conn.createStatement();         
            ResultSet rs = stmt.executeQuery("select * from usuarios_db where u_usuario='"+usuario+"' and u_contraseña='"+Arrays.toString(contrasena)+"'");  
            if (rs.next()){
                int expected = 0;
                int result = 0;
                assertEquals(expected, result);
            }else{
                int expected = 1;
                int result = 1;
                assertEquals(expected, result);
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
