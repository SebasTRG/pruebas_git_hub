/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class UtilsTest {
    
  
    @Test
    public void testDivisionPerZero() {
        assertThrows(IllegalArgumentException.class,()-> utils.Utils.division(1, 0));
    }
    @Test
    public void testDivision(){
        assertEquals(1, utils.Utils.division(1, 1));
    }@Test
    public void testDivisionNotEquals(){
        assertNotEquals(2, utils.Utils.division(1, 1));
    }
    
    
}
