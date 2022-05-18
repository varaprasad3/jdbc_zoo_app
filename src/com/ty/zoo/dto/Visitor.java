package com.ty.zoo.dto;

public class Visitor {
   int id;
   String name;
   String email;
   String phone;
   String gender;
   String age;
   Visitor()
   {}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Visitor(int id, String name, String email, String phone, String gender, String age) {

	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.gender = gender;
	this.age = age;
}
   
}
