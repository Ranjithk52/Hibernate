package com.ojas.pojo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Contract_Employe")
@PrimaryKeyJoinColumn(name="id")
public class ContractEmply extends Employee {
	public int per_per_hour;
	public String duration;
	public int getPer_per_hour() {
		return per_per_hour;
	}
	public void setPer_per_hour(int per_per_hour) {
		this.per_per_hour = per_per_hour;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	

}
