package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void testAnimal() {
		Animal animal = new Animal("Lion", "MAMMIFERE", "CARNIVORE");
		assertEquals("Lion", animal.getNom());
		assertEquals("MAMMIFERE", animal.getType());
		assertEquals("CARNIVORE", animal.getComportement());
	}

}
