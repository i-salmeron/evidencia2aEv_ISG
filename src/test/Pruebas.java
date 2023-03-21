package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void test1() throws Exception {
		CuentaBancaria cb=new CuentaBancaria();
		cb.agregarSaldo(5000);
		cb.solicitarPrestamo(10000);
		assertEquals(15000, cb.obtenerSaldo());
	}
	
	@Test
	void test2() throws Exception {
		CuentaBancaria cb=new CuentaBancaria();
		cb.agregarSaldo(2000);
		cb.solicitarPrestamo(12000);
		assertEquals(6000, cb.obtenerPrestamo());
		
	}
	
	@Test
	void test3() throws Exception {
		CuentaBancaria cb=new CuentaBancaria();
		cb.agregarSaldo(1000);
		cb.solicitarPrestamo(2000);
		assertThrows(Exception.class, ()->cb.solicitarPrestamo(4000));
	}

}
