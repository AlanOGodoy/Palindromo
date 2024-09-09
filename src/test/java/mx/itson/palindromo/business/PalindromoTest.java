/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.palindromo.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Esta clase es donde se hacen las pruebas unitarias del programa realizado
 * @author alang
 */
public class PalindromoTest {
    
    public PalindromoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of esPalindromo method, of class Palindromo.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String word = "ojo";
        boolean expResult = true;
        boolean result = Palindromo.esPalindromo(word);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumar method, of class Palindromo.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 5;
        int b = 5;
        Palindromo instance = new Palindromo();
        int expResult = 10;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }
    
}
