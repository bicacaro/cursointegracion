package es.gobcan.ece.integracion1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba19052021 {
	
	public static final Logger logger = Logger.getLogger("es.gobcan.ece.integracion.Prueba19052021");

	//public static Integer suma(Integer numero1, Integer numero2) {		
	public static int suma(int numero1, int numero2) {		
		//numero2 = null;
		//return (numero1.intValue() + numero2.intValue());
		return (numero1 + numero2);
	}
	
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Hello word!");
		logger.log(Level.INFO,"Suma de 10 con 35 es {0}", suma(10,35));
	}

}
