package com.ojas.model2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class usertable {
	@Id
	private int id;
	private String name;
	private String email;
	private String mobile;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String city;
	private String gender;
	
	
	

}
