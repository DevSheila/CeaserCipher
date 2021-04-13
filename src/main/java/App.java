
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
        }
    }
}
