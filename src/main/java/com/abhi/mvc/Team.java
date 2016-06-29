package com.abhi.mvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="team")
public class Team {

@Id 
@GenericGenerator(name="idseq",strategy="increment")
@GeneratedValue(generator="idseq")
private int id;

@Column(name="name")
private String name;

@Column(name="rating")
private int rating;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

}
