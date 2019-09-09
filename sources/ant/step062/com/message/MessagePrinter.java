package com.message;

import org.printer.Printer;

public class MessagePrinter {

    public static void main(String[] args) {

        Printer printer = new Printer();

        if(args.length > 0) {
            
            printer.print(args[0]);
        } else {

            printer.print("no Argument");
        }
    }
}