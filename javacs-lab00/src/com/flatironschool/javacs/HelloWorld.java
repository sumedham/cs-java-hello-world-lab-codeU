package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String version = System.getProperty("java.specification.version");
    	Double ver = Double.parseDouble(version);
    	return ver;

    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
    }
}
