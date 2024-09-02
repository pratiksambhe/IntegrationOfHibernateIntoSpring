package com.HibernateConnection.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Classroom {
	@Id
private int classid;
private String classname;
private int classcapacity;
public Classroom() {
	super();
	// TODO Auto-generated constructor stub
}
public Classroom(int classid, String classname, int classcapacity) {
	super();
	this.classid = classid;
	this.classname = classname;
	this.classcapacity = classcapacity;
}

public Classroom(String classname, int classcapacity) {
	super();
	this.classname = classname;
	this.classcapacity = classcapacity;
}
public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public int getClasscapacity() {
	return classcapacity;
}
public void setClasscapacity(int classcapacity) {
	this.classcapacity = classcapacity;
}
@Override
public String toString() {
	return "Classroom [classid=" + classid + ", classname=" + classname + ", classcapacity=" + classcapacity + "]";
}

}
