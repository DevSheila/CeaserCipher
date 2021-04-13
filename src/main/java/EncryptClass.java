public class EncryptClass {
    private String inputMessage;
    private int shiftKey;
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private StringBuilder encryptedMessage = new StringBuilder("");
    private int currentCharPosition;
    private int newCharPosition;
    private char newCharValue;

    public String EncryptMessage(String inputMessage,int shiftKey){
        this.inputMessage = inputMessage.toUpperCase();
        this.shiftKey= shiftKey;

        for(int i=0;i<this.inputMessage.length();i++){
            //if it is not an alphabet,append as it is to the encrypted text.
            if(!Character.isLetter(this.inputMessage.charAt(i))){
                encryptedMessage.append(this.inputMessage.charAt(i));
            }else{
                //get alphabet index of current character of message
                currentCharPosition = alphabets.indexOf(this.inputMessage.charAt(i));
                newCharPosition = (currentCharPosition + shiftKey)%26;

                newCharValue = alphabets.charAt(newCharPosition);

                encryptedMessage.append(newCharValue);

            }
        }

        return encryptedMessage.toString();
    }
    public String getEncryptedMessage(){
        return encryptedMessage.toString();
    }
}
