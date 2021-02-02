package com.ba.solid.l.bad;

import jdk.jshell.spi.ExecutionControl;

public class HpPrinter extends BasePrinter{
    @Override
    public void Print(String value) {

    }

    @Override
    public void Scan(String value) {

        try {
            throw new ExecutionControl.NotImplementedException("Hata");
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
    }
}
