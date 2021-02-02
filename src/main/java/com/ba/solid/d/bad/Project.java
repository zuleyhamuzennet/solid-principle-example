package com.ba.solid.d.bad;

public class Project {
    private BackEndDeveloper backEndDeveloper= new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper=new FrontEndDeveloper();

    public void implement(){
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
