package com.ba.solid.o.better;

public class Logger {
    private ILogger iLogger;

    public Logger(ILogger iLogger) {
        this.iLogger = iLogger;
    }
    public void log(String value){
        iLogger.log(value);
    }
}
