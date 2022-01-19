import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado E1=new Empleado("Hanna","Montana",45,4000.00);
	Empleado E2=new Empleado("Peter","Potter",30,2000.00);
	
	@Test
	void testPlus() {
		//Compruebo que es correcto que el Empleado1 es mayor de 40 a�os
		assertFalse(E1.plus(9.00));
		//Compruebo que es correcto que el Empleado2 es menor de 40 a�os
		assertTrue(E2.plus(5.00));
	}

	@Test
	void testEqualsEmpleado() {
		//Compruebo que el Empleado1 y el Empleado2 tienen apellidos y edades distintas 
		assertFalse(E1.equals(E2));
	}

	@Test
	void testCompareTo() {
		//Compruebo que el Empleado1 es mayor al Empleado2
		assertTrue(E1.getEdad()>E2.getEdad());
	}

	@Test
	void testToString() {
		//Compruebo todos los datos de nuestros empleados
		System.out.println(E1);
		System.out.println(E2);
	}

}
