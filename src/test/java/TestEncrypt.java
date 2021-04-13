
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
    @Test
    public void newEncrypt_encryptsOriginalMessage(){
        EncryptClass testEncrypt = new EncryptClass();
        String output = testEncrypt.EncryptMessage("we attack at dawn",4);
        String expectedOutput = "AI EXXEGO EX HEAR";
        assertEquals(expectedOutput,output);

    }
    @Test
    public void newEncrypt_getMessage(){
        EncryptClass testEncrypt = new EncryptClass();
        testEncrypt.EncryptMessage("we attack at dawn",4);
        String expectedOutput = "AI EXXEGO EX HEAR";
        assertEquals(expectedOutput,testEncrypt.getEncryptedMessage());

    }
    @Test
    public void newDecrypt_decryptsEncryptedMessage(){
        Decrypt testDecrypt = new Decrypt();
        String output = testDecrypt.decryptMessage("AI EXXEGO EX HEAR",4);
        String expectedOutput = "WE ATTACK AT DAWN";
        assertEquals(expectedOutput,output);

    }
    @Test
    public void newDecrypt_getMessage(){
        Decrypt testDecrypt = new Decrypt();
        testDecrypt.decryptMessage("AI EXXEGO EX HEAR",4);
        String expectedOutput = "WE ATTACK AT DAWN";
        assertEquals(expectedOutput,testDecrypt.getDecryptedMessage());

    }
}