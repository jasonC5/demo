package com.jason.temp.innerClass;

public class DoSomeThing {
    DoBefore doBefore;
    DoMethod doMethod;
    DoAfter doAfter;

//    String [] stream;
//
//    public String[] getStream() {
//        return stream;
//    }
//
//    public void setStream(String[] stream) {
//        this.stream = stream;
//    }

    public DoSomeThing(DoBefore doBefore,
                       DoMethod doMethod,
                       DoAfter doAfter){
        this.doBefore = doBefore;
        this.doMethod = doMethod;
        this.doAfter = doAfter;
    }

    public void doing(){
        doBefore.doSomeReadyThing();
        doMethod.doSomThing();
        doAfter.doSomeEndingThing();
    }
}
