package com.ojas.pojo;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Two_Wheeler")
public class TwoWheeler extends Vehicle {

	public int wheels2;

	public int getWheels2() {
		return wheels2;
	}

	public void setWheels2(int wheels2) {
		this.wheels2 = wheels2;
	}
	
	
	
}
