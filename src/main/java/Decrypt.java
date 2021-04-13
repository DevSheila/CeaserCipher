public class Decrypt {
    private String encryptedMessage;
    private int shiftKey;
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private StringBuilder decryptedMessage = new StringBuilder("");
    private int currentCharPosition;
    private int newCharPosition;
    private char newCharValue;

    public String decryptMessage(String encryptedMessage, int shiftKey) {

        this.encryptedMessage = encryptedMessage.toUpperCase();
        this.shiftKey= shiftKey;

        for(int i =0; i<this.encryptedMessage.length();i++){
            if(!Character.isLetter(this.encryptedMessage.charAt(i))){
                decryptedMessage.append(this.encryptedMessage.charAt(i));
            }else{
                currentCharPosition = alphabets.indexOf(this.encryptedMessage.charAt(i));
                newCharPosition=(currentCharPosition - this.shiftKey )%26;

                if(newCharPosition<0){
                    newCharPosition = alphabets.length()+ newCharPosition;
                }

                newCharValue = alphabets.charAt((newCharPosition));
                decryptedMessage.append(newCharValue);
            }
        }

        return decryptedMessage.toString();
    }
}