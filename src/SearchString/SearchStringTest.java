package SearchString;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchStringTest {

	@Test
	public void testValidLength() {
		assertTrue(isValidLength(1));
		assertTrue(isValidLength(10));
		assertTrue(isValidLength(20));
	}

	@Test
	public void testInvalidLength() {
		assertFalse(isValidLength(0));
		assertFalse(isValidLength(21));
	}

	@Test
	public void testValidStringLength() {
		assertTrue(isValidStringLength("abcde", 5));
		assertTrue(isValidStringLength("1234567890", 10));
		assertTrue(isValidStringLength("abcdefghijklmnopqrst", 20));
	}

	@Test
	public void testInvalidStringLength() {
		assertFalse(isValidStringLength("", 5));
		assertFalse(isValidStringLength("abcd", 5));
		assertFalse(isValidStringLength("abcdef", 5));
	}

	@Test
	public void testCharacterFound() {
		assertEquals(1, findCharacter("hello", 'e'));
		assertEquals(0, findCharacter("world", 'w'));
		assertEquals(4, findCharacter("world", 'd'));
	}

	@Test
	public void testCharacterNotFound() {
		assertEquals(-1, findCharacter("hello", 'z'));
		assertEquals(-1, findCharacter("world", 'a'));
		assertEquals(-1, findCharacter("java", 'x'));
	}

	// Métodos auxiliares para validação e busca de caracteres
	public boolean isValidLength(int length) {
		return length >= 1 && length <= 20;
	}

	public boolean isValidStringLength(String str, int length) {
		return str.length() == length;
	}

	public int findCharacter(String str, char ch) {
		return str.indexOf(ch);
	}
}
