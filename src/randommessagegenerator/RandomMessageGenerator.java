/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.*;

/**
 * This class returns a random message from a List, it has a way to add messages
 * and to get all the messages out.  The addNewMessage incorporates a Set to
 * eliminate duplicate messages.
 * @author mdeboer1
 */
public class RandomMessageGenerator {
    private List<String> list = new ArrayList<>();
    private String message;
    
    public RandomMessageGenerator(){
        list.add("Hello there");
        list.add("Have a nice day");
        list.add("Be a good person");
        list.add("Eat your vegetables");
    }
    
    public final void addNewMessage(String message){
        if (message.isEmpty()){
            throw new MessageNotProvidedException();
        }
        
        try{
            list.add(message);
        }catch(MessageNotProvidedException mnp){
            throw new MessageNotProvidedException();
        }
        
        Set<String> set = new HashSet<>(list);
        list.clear();
        for (String string : set){
            list.add(string);
        }
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.message);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }
    
    public final String getRandomMessage(){
        Random random = new Random();
        int randomNum = random.nextInt(list.size());
        String randomMessage = list.get(randomNum);
        return randomMessage;
    }

    public final List getAllMessages(){
        return list;
    }
}
