package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table
@Data

public class Employee {
	
private int eid;
private String ename;
private String email;
}
