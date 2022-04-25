/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcs_grupo_jaj;

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
public class Usuarios_BajaTest {
    
    public Usuarios_BajaTest() {
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
     * Test of bajaUsuario method, of class Usuarios_Baja.
     */
    @Test
    public void testBajaUsuario() {
        System.out.println("bajaUsuario");
        String usuario = "";
        Usuarios_Baja instance = new Usuarios_Baja();
        instance.bajaUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Usuarios_Baja.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Usuarios_Baja.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
