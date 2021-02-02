package com.ba.solid.o.bad;

public class Logger {
    private XmlLog xmlLog;
    private DbLog dbLog;

    public Logger(XmlLog xmlLog, DbLog dbLog) {
        this.xmlLog = xmlLog;
        this.dbLog = dbLog;
    }

    public void Log(LogType logType,String value){
        switch (logType){
            case Xml:
                xmlLog.Log(value);
                break;
            case Db:
                dbLog.Log(value);
                break;
        }
    }
}
