package es.gobcan.ece.integracion1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperacionesTest {
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
	@Test
	public void PruebaResta1Test () {		
		assertEquals("3 - 2 es 1", 1, Operaciones.resta(3, 2) );
	}
	
	@Test
	public void PruebaResta2Test () {
		assertTrue("10 + 10 es 20", Operaciones.resta(10,10)==0 );	
	}
	
	@Test
	public void PruebaMultiplicacionTest () {
		assertNotEquals("La multipliacion ha dejado de ser correcta", 200, Operaciones.multiplicacion(100, 100));
		assertEquals("2 * 2 es 4", 4, Operaciones.multiplicacion(2,2));
		
	}
	
	@Test
	public void PruebaDivision1Test () {		
		assertEquals("10 / 5 es 2", 2, Operaciones.division(10, 5));
	}
	
	@Test
	public void PruebaDivision2Test () {		
		assertEquals("100 / 1 es 100", 100, Operaciones.division(100, 1));		
	}
	
	@Test
	public void PruebaDivisionTest () {		
		assertEquals("100 / 2 es 50", 50, Operaciones.division(100, 2));		
		assertNotEquals("La división ha dejado de ser correcta", 0, Operaciones.division(100, 100));
		try {
			assertEquals("100 / 0" , 0, Operaciones.division(100, 0));
 		}
 		catch(ArithmeticException e) {
 			 assertTrue( true );
 		}

	}
}
