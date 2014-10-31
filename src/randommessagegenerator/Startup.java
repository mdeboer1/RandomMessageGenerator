/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.*;

/**
 * Startup class for this package
 * @author mdeboer1
 */
public class Startup {
    public static void main(String[] args) {
        RandomMessageGenerator generator = new RandomMessageGenerator();
        System.out.println("Your message is: " + generator.getRandomMessage());
        List<String> list;
        list = generator.getAllMessages();
        System.out.println("All the messages are: ");
        for (String list1 : list) {
            System.out.println(list1);
        }
        generator.addNewMessage("Have a nice day");
        System.out.println("The new messages are: ");
        for (String list1 : list) {
            System.out.println(list1);
        }
    }
}
