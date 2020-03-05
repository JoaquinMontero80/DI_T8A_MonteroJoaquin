/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import sample.Utils;

/**
 *
 * @author usuario
 */
public class UtilsTest
{
    
    public UtilsTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("* UtilsTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        System.out.println("* UtilsTest: @AfterClass method");
    }
    
    @Before
    public void setUp()
    {
        System.out.println("* UtilsTest: @Before method");
    }
    
    @After
    public void tearDown()
    {
        System.out.println("* UtilsTest: @After method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
/*    @Test
    public void testConcatWords()
    {
        System.out.println("concatWords");
        String[] words = null;
        String expResult = "";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    Cambiamos por helloWorldCheck
*/
    
    @Test
    public void helloWorldCheck()
    {
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }
    /**
     * Test of computeFactorial method, of class Utils.
     */
/*    @Test
    public void testComputeFactorial()
    {
        System.out.println("computeFactorial");
        int number = 0;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    // Esta prueba demuestra cómo verificar si un método tarda demasiado en completarse. Si el método
    // tarda demasiado, el hilo de prueba se interrumpe y la prueba falla. Se puede especificar el límite de
    // tiempo en la prueba.
    @Test(timeout=1000)
    public void testWithTimeout(){
        System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
/*    @Test
    public void testNormalizeWord()
    {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    Se cambia por temporarilyDisabledTest()
*/
    // Esta prueba demuestra cómo deshabilitar temporalmente un método de prueba. Simplemente
    // agregando la anotación @Ignore para desactivar la prueba.
    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception 
    {
        System.out.println("* UtilsTest: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
    // Esta prueba demuestra cómo probar una excepción esperada. El método falla si no genera la
    // excepción esperada especificada. En este caso, se está probando que el método computeFactorial
    // genera una IllegalArgumentException si la variable de entrada es un número negativo (-5).
    @Test (expected=IllegalArgumentException.class)
    public void checkExpectedException() 
    {
        System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    
} // Fin de clase 
