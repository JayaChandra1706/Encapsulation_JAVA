package com.java.practice.encapsulasion;

public class Fan {
   
    int noofblades;
    String brand;
    String color;
    
   public Fan() {
	   
     }

public Fan(int noofblades, String brand, String color) {
	this.noofblades = noofblades;
	this.brand = brand;
	this.color = color;
}

public Fan(String brand, String color) {
	this(3,"bajaj",color);
	this.brand = brand;
	this.color = color;
}

public Fan(int noofblades, String brand) {
	this.noofblades = noofblades;
	this.brand = brand;
}
   
}
