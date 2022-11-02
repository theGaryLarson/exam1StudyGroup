package com.exam1.statics;

public class Singleton {
    //illustrates simple use of Singleton pattern. Only one of these objects can be created. If more are created it
    // will cause an Exception to be thrown
    static boolean isActive = false; //singleton pattern example
    public int border_value;
    
    public Singleton() {
        if(isActive) throw  new ExceptionInInitializerError(); //singleton pattern example
        init(); //static class constants example
        isActive = true; //singleton pattern example
    }
    
    private void init() {
        //some dummy code just to illustrate the use of class constants used statically
        border_value = ProjectConstants.DOTTED_BORDER;
        //or
        border_value = ProjectConstants.DASHED_BORDER; //worth noting that
        //or
        border_value = ProjectConstants.SOLID_BORDER;
    }
}
