package es.gobcan.ece.integracion1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Prueba19052021Test {
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
	@Test
	public void PruebaTest () {		
		assertEquals("3 + 2 es 5", 5, Prueba19052021.suma(3, 2) );
	}
	
	@Test
	public void Prueba1Test () {
		assertTrue("10 + 10 es 20", Prueba19052021.suma(10,10)==20 );	
	}
	
	@Test
	public void Prueba2Test () {
		assertNotEquals("La suma ha dejado de ser correcta", 10000, Prueba19052021.suma(100, 100));
		assertEquals("2 + 2 es 4", 4, Prueba19052021.suma(2,2));
		
	}
	
	@Test
	public void Prueba3Test () {		
		assertEquals("0 + 0 es 0", -1, Prueba19052021.suma(0, 0) );
	}
}
