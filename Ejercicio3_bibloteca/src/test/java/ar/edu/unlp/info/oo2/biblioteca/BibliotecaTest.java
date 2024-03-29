package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private Biblioteca bibliotecaVacia;
	private JsonSimpleAdapter adapator;

	@BeforeEach
	public void setUp() {
		this.bibliotecaVacia = new Biblioteca();
		this.biblioteca = new Biblioteca();
		//this.adapator = new JsonSimpleAdapter();
		//biblioteca.setExporter(adapator);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	@Test
	public void jsonVacioTest() {
		assertEquals("[]",this.bibliotecaVacia.exportarSocios());
	}
	@Test
	public void jsonStringTest() {
		String aux= "[\"{\\\"legajo\\\":\\\"5234-5\\\",\\\"nombre\\\":\\\"Arya Stark\\\",\\\"email\\\":\\\"needle@stark.com\\\"}\",\"{\\\"legajo\\\":\\\"2345-2\\\",\\\"nombre\\\":\\\"Tyron Lannister\\\",\\\"email\\\":\\\"tyron@thelannisters.com\\\"}\"]";;
		assertEquals(aux,this.biblioteca.exportarSocios());
	}

}
