package com.ba.solid.o.better.logtype;

import com.ba.solid.o.better.ILogger;

public class DbLog implements ILogger {
    @Override
    public boolean log(String value) {
        return true;
    }
}