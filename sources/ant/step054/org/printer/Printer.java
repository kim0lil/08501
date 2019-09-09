package org.printer;

import org.message.Message;

public class Printer {

    public void print(String message) {
        
        Message m = new Message();
        System.out.println(m.message+" : "+message);
    }
}