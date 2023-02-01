package com.ojas.pojo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="Four_Wheeler")
public class FourWheeler extends Vehicle {
public int wheels4;

public int getWheels4() {
	return wheels4;
}

public void setWheels4(int wheels4) {
	this.wheels4 = wheels4;
}

}
