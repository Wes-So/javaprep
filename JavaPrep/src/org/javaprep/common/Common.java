package org.javaprep.common;

public enum Common {

	Success("SUCCESS"),Error("ERROR");


    private String value;
    
    public String getValue() {
        return value;
    }
    
    private Common(String code) {
        value = code;
    } 
}
