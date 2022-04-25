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
public class Centros_AltaTest {
    
    public Centros_AltaTest() {
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
     * Test of crearNuevoCentro method, of class Centros_Alta.
     */
    @Test
    public void testCrearNuevoCentro() {
        System.out.println("crearNuevoCentro");
        String nombreCentro = "";
        int capacidadProceso = 0;
        int tamanoColaTrabajos = 0;
        String usuarioAdministrador = "";
        Centros_Alta instance = new Centros_Alta();
        instance.crearNuevoCentro(nombreCentro, capacidadProceso, tamanoColaTrabajos, usuarioAdministrador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Centros_Alta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Centros_Alta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
