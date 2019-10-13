package VigenereCipher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VigenereTest {

    @DisplayName("Correct cipher instance with no args")
    @Test
    public void testIfCesarExist() {
        Vigenere vigenere = new Vigenere();
        assertNotNull(vigenere);
    }

    @DisplayName("Correct cipher instance with phrase")
    @Test
    public void testPassStringToConstructor() {
        Vigenere vigenere = new Vigenere("simple" , "key");
        assertNotNull(vigenere);
    }

    @Test
    public void testEncrypWhenNoTextThenEmptyString() {
        Vigenere vigenere = new Vigenere();
        String encoded = vigenere.encrypt();

        assertNotNull(encoded);
        assertEquals("", encoded);

    }

    @Test
    public void testSimpleEncrypt() {
        Vigenere vigenere = new Vigenere("RAZDWATRZYSZYFRUJESZTY", "VIGENERECIPHER");
        String code = "MIFHJEKVBGHGCWMCPIFDKC";
        String encoded = vigenere.encrypt();
        assertEquals(code, encoded);

        vigenere = new Vigenere("Struktury", "KEY");
        code = "CXPEOREVW";
        encoded = vigenere.encrypt();
        assertEquals(code, encoded);

    }

    @Test
    public void testSimpleDecrypt() {
        Vigenere vigenere = new Vigenere("MIFHJEKVBGHGCWMCPIFDKC", "VIGENERECIPHER");
        String encoded = "RAZDWATRZYSZYFRUJESZTY";
        String code = vigenere.decrypt();
        assertEquals(encoded, code);

        vigenere = new Vigenere("CXPEOREVW", "KEY");
        encoded = "STRUKTURY";
        code = vigenere.decrypt();
        assertEquals(encoded, code);

    }
}