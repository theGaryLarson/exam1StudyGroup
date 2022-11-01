package com.exam1.enumeratedtypes;

public class EnumeratedTypes {
    
    public static void main(String[] args) {
        //private enumerators accessible within the class no class name at beginning of call
        Days day =  Days.MONDAY;
        System.out.println(day);
    }
    
    private enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
    }
    
    public enum hAlignment {
        LEFT, MIDDLE, RIGHT
    }
    
    public enum vAlignment {
        TOP, CENTER, BOTTOM
    }
}
