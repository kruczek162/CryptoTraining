package eu.szestkam.cryptotraining.rot_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ROT13Test {
    private static final String SAMPLE_PHRASE = "sample";
    private ROT13 cipherNoArg;
    private ROT13 cipherPhrase;

    @BeforeEach
    void setUp() {
        cipherNoArg = new ROT13();
        cipherPhrase = new ROT13(SAMPLE_PHRASE);
    }

    @DisplayName("Correct cipher instance with no args")
    @Test
    public void testIfCesarExist() {
        ROT13 cipher = cipherNoArg;
        assertNotNull(cipher);
    }

    @DisplayName("Correct cipher instance with phrase")
    @Test
    public void testPassStringToConstructor() {
        ROT13 cipher = cipherPhrase;
        assertNotNull(cipher);
    }

    @Test
    public void testEncrypWhenNoTextThenEmptyString() {
        ROT13 cipher = cipherNoArg;
        String encoded = cipher.encode();

        assertNotNull(encoded);
        assertEquals("", encoded);
    }

    @Test
    public void testEncrypWhenTextThenSameLenghtOfString() {
        ROT13 cipher = cipherPhrase;
        String encoded = cipher.encode();

        assertNotNull(encoded);
        assertEquals(SAMPLE_PHRASE.length(), encoded.length());
    }

//    @Test
//    public void testSimpleEncodeLowerCase() {
//        ROT13 cipher = new ROT13("abc");
//        String code = "def";
//        String encoded = cipher.encode();
//        assertEquals(code, encoded);
//
//        cipher = new ROT13("xyz");
//        code = "abc";
//        encoded = cipher.encode();
//        assertEquals(code, encoded);
//    }

    @Test
    public void testSimpleEncodeMixedCase() {
        ROT13 cipher = new ROT13("Algorytmy");
        String code = "Nytbelgzl";
        String encoded = cipher.encode();
        assertEquals(code, encoded);

        cipher = new ROT13("Struktury");
        code = "Fgehxghel";
        encoded = cipher.encode();
        assertEquals(code, encoded);
    }

    @Test
    public void testSimpleDecodeMixedCase() {
        ROT13 cipher = new ROT13("Nytbelgzl");
        String code = "Algorytmy";
        String encoded = cipher.decrypt();
        assertEquals(code, encoded);

        cipher = new ROT13("Fgehxghel");
        code = "Struktury";
        encoded = cipher.decrypt();
        assertEquals(code, encoded);

    }


}