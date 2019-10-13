package eu.szestkam.cryptotraining.AtBashCipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtBashTest {

    private static final String SAMPLE_PHRASE = "sample";

    @Test
    public void testIfAtBaschExist ()
    {
        AtBash atBash = new AtBash();
        assertNotNull(atBash);
    }

    @Test
    public void testPassStringToConstructor () {
        AtBash atBash = new AtBash(SAMPLE_PHRASE);
        assertNotNull(atBash);
    }

    @Test
    public void testEncrypWhenNoTextThenEmptyString() {
        AtBash atBash = new AtBash();
        String encoded = atBash.code();

        assertNotNull(atBash);
        assertEquals("", encoded);
    }

    @Test
    public void testEncrypWhenTextThenSameLenghtOfString() {
        AtBash atBash = new AtBash(SAMPLE_PHRASE);
        String encoded = atBash.code();

        assertNotNull(encoded);
        assertEquals(SAMPLE_PHRASE.length(), encoded.length());
    }

    @Test
    public void testSimpleEncodeMixedCase() {
        AtBash atBash = new AtBash("ABCdef");
        String code = "ZYXwvu";
        String encoded = atBash.code();
        assertEquals(code, encoded);

        atBash = new AtBash("XYz");
        code = "CBa";
        encoded = atBash.code();
        assertEquals(code, encoded);
    }

    @Test
    public void testSimpleDecodeMixedCase() {
        AtBash atBash = new AtBash("izawdzgiab");
        String code = "razdwatrzy";
        String encoded = atBash.code();
        assertEquals(code, encoded);

        atBash = new AtBash("CBa");
        code = "XYz";
        encoded = atBash.code();
        assertEquals(code, encoded);

        atBash =new AtBash ("ZYXwvu");
        code = "ABCdef";
        encoded = atBash.code();
        assertEquals(code, encoded);
    }


}