package com.ba.solid.l.better;

public class Printer {
    BasePrinter canonPrinter=new CanonPrinter();
    BasePrinter hpPrinter=new HpPrinter();
    CanonPrinter canonScaner=new CanonPrinter();

    public void Print(String value){
        canonPrinter.Print(value);
        canonScaner.Scan(value);
        hpPrinter.Print(value);
    }
}
