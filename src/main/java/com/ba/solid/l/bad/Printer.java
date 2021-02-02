package com.ba.solid.l.bad;

public class Printer {
    BasePrinter canonPrinter= new CanonPrinter();
    BasePrinter hpPrinter = new HpPrinter();

    public void Print(String value){
        canonPrinter.Print(value);
        canonPrinter.Scan(value);

        hpPrinter.Print(value);
        hpPrinter.Scan(value);
    }

}
