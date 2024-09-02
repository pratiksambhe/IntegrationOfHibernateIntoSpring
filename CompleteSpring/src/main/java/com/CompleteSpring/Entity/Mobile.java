package com.CompleteSpring.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Mobile {
	@Id
private int id;
private int cost;
private String name;
private String brand;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(int id, int cost, String name, String brand) {
	super();
	this.id = id;
	this.cost = cost;
	this.name = name;
	this.brand = brand;
}
public Mobile(int cost, String name, String brand) {
	super();
	this.cost = cost;
	this.name = name;
	this.brand = brand;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Mobile [id=" + id + ", cost=" + cost + ", name=" + name + ", brand=" + brand + "]";
}

}
