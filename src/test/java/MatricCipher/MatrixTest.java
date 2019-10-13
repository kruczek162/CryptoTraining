package MatricCipher;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    public void test () {
        Matrix matrix = new Matrix();
        assertNotNull(matrix);
    }

    @Test
    public void testEncrypWhenNoTextThenEmptyString () {
        Matrix matrix = new Matrix("", "");
        String encode = matrix.HillCipher();
        assertEquals("", encode);
    }


    @Test
    public void testSimpleEncrypt () {
        Matrix matrix = new Matrix("ACT", "GYBNQKURP");
        String code = "POH";
        String encode = matrix.HillCipher();
        assertEquals(code, encode);

    }


}