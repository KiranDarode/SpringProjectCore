package com.mavenSpringCore3;

public class Student {
     private int x;
     private College obj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public College getObj() {
		return obj;
	}
	public void setObj(College obj) {
		this.obj = obj;
	}
	/**
	 * @param x
	 * @param obj
	 */
	public Student(int x, College obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", obj=" + obj + "]";
	}
     
     
     
}
