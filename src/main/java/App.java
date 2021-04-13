
import java.io.*;

public class App {
    public static void main(String [] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Welcome To Ceasar Cipher!");
        boolean runningProgram = true;

        while (runningProgram) {
            System.out.println("**---------------------------------------------------------**");
            System.out.println("Enter A, B or C to choose one of the following options");
            System.out.println("A. Encrypt And Decrypt Message");
            System.out.println("B. Encrypt And Decrypt File");
            System.out.println("C. Exit");
            try{


                String choice = bufferedReader.readLine();
                System.out.println(choice);

                if(choice.equals("A")){

                    System.out.print("PLease enter your message");
                    String originalMessage = bufferedReader.readLine();

                    System.out.print("PLease enter  Key between 1 and 25");
                    int shiftKey = Integer.parseInt(bufferedReader.readLine());

                    Ceasar msgCeasar = new Ceasar(originalMessage,shiftKey);
                    EncryptClass msgEncrypt = new EncryptClass();
                    Decrypt msgDecrypt =new Decrypt();

                    msgEncrypt.EncryptMessage(msgCeasar.getMessage(), msgCeasar.getShiftKey());
                    msgDecrypt.decryptMessage(msgEncrypt.getEncryptedMessage(),msgCeasar.getShiftKey() );

                    System.out.println("Input Message :"+ originalMessage);
                    System.out.println("Encrypted Message :"+msgEncrypt.getEncryptedMessage() );

                    System.out.println("Decrypted Message :"+msgDecrypt.getDecryptedMessage() );


                }else {
                    System.out.println("Invalid Choice please try again");
                }



            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
