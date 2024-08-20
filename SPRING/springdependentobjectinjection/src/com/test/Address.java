//Address Bean
package com.test;

public class Address {
	String city;
	String state;
	String country;
	Location location;
	
	
	public Address(String city, String state, String country, Location location) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", "+ location + "]";
	}
	
	
	

}
