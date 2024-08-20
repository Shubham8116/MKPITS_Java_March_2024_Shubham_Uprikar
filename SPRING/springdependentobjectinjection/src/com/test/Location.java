//Location Bean
package com.test;

public class Location {
private int pincode;
private int statecode;
public Location(int pincode, int statecode) {
	super();
	this.pincode = pincode;
	this.statecode = statecode;
}
@Override
public String toString() {
	return "Location [pincode=" + pincode + ", statecode=" + statecode + "]";
}



}
