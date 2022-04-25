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
public class Usuarios_ModificacionTest {
    
    public Usuarios_ModificacionTest() {
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
     * Test of modificarUsuario method, of class Usuarios_Modificacion.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("modificarUsuario");
        String usuario = "";
        char[] contrasena = null;
        String tipoUsuario = "";
        Usuarios_Modificacion instance = new Usuarios_Modificacion();
        instance.modificarUsuario(usuario, contrasena, tipoUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Usuarios_Modificacion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Usuarios_Modificacion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
