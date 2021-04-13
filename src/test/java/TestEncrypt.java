
import org.junit.Test;

import static org.junit.Assert.*;
public class TestEncrypt {
    @Test
    public void newCeasar_instantiatesCorrectly() {
        Ceasar testCeasar = new Ceasar("we attack at dawn", 4);
        assertEquals(true, testCeasar instanceof Ceasar);
    }

    @Test
    public void newEncrypt_instantiatesCorrectly() {
        EncryptClass testEncrypt = new EncryptClass();
        assertEquals(true, testEncrypt instanceof EncryptClass);
    }

    @Test
    public void newDecrypt_instantiatesCorrectly() {
        Decrypt testDecrypt = new Decrypt();
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void newApp_instantiatesCorrectly() {
        App newApp = new App();
        assertEquals(true, newApp instanceof App);
    }
    @Test
    public void newCeasar_getMessage(){
        Ceasar testCeasar = new Ceasar("we attack at dawn", 4);
        assertEquals("we attack at dawn" ,testCeasar.getMessage());

    }
    @Test
    public void newCeasar_getShiftKey(){
        Ceasar testCeasar = new Ceasar("we attack at dawn", 4);
        assertEquals(4 ,testCeasar.getShiftKey());

    }
}