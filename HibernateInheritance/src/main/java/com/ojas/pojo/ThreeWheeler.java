package com.ojas.pojo;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="Three_Wheeler")
public class ThreeWheeler extends Vehicle {

	public int wheels3;

	public int getWheels3() {
		return wheels3;
	}

	public void setWheels3(int wheels3) {
		this.wheels3 = wheels3;
	}
	
}
