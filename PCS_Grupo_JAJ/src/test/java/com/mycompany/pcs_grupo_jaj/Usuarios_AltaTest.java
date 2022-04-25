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
public class Usuarios_AltaTest {
    
    public Usuarios_AltaTest() {
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
     * Test of altaUsuario method, of class Usuarios_Alta.
     */
    @Test
    public void testAltaUsuario() {
        System.out.println("altaUsuario");
        String usuario = "";
        char[] contrasena = null;
        String tipoUsuario = "";
        Usuarios_Alta instance = new Usuarios_Alta();
        instance.altaUsuario(usuario, contrasena, tipoUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Usuarios_Alta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Usuarios_Alta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
