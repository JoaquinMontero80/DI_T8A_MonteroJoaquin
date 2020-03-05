/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit_maximo.MasGrande;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joaquin
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMax() 
    {
        System.out.println("VACIO");
        int[] a = {};
        int expResult = 0;
        int resultado = MasGrande.max(a);
        assertEquals(expResult, resultado);
        
        //=================================
        
        System.out.println("UN ELEMENTO");
        int[] b = {5};
        expResult = 5;
        resultado = MasGrande.max(b);
        assertEquals(expResult, resultado);
        
        //================================
        
        System.out.println("VARIOS ELEMENTOS ORDENADOS");
        int[] c = {3,5,8};
        expResult = 8;
        resultado = MasGrande.max(c);
        assertEquals(expResult, resultado);
        
        //================================
        
        System.out.println("VARIOS ELEMENTOS DESORDENADOS");
        int[] d = {8,53,5};
        expResult = 53;
        resultado = MasGrande.max(d);
        assertEquals(expResult, resultado);
        
        //================================
        
        System.out.println("VARIOS ELEMENTOS Y NEGATIVOS");
        int[] e = {3,-12,23,-15,8};
        expResult = 23;
        resultado = MasGrande.max(e);
        assertEquals(expResult, resultado);
        
        //================================
        
        System.out.println("ELEMENTOS NULO");
        
        try
        {
            int[] f = null;
            Integer nulo = null;
            expResult = nulo;
            resultado = MasGrande.max(f);
            assertEquals(expResult, resultado);
        }
        catch(NullPointerException n)
        {
            System.out.println("Excepcion esperada.");
        }
        
    } // Fin de metodo testMax
    
} // Fin de clase 
