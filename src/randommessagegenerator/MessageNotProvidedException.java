/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

/**
 * This is practice of custom exception handling classes.  It is used in this
 * package to alert a user they have either entered and empty string as a message
 * or passed no string at all.
 * @author mdeboer1
 */
public class MessageNotProvidedException extends NullPointerException {
    private static String message = "You must provided a valid message";
    
    public MessageNotProvidedException(){
        super(message);
    }

    public static void setMessage(String message) {
        MessageNotProvidedException.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}    
