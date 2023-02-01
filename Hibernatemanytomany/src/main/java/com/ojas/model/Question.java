package com.ojas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String qname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Question",
	joinColumns={@JoinColumn(name="q_id")},
	inverseJoinColumns={@JoinColumn(name="ans_id")})
	private List<Answers> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	

}
