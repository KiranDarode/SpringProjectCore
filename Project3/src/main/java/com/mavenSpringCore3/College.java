package com.mavenSpringCore3;

public class College {

	private int ycollege;

	public int getYcollege() {
		return ycollege;
	}

	public void setYcollege(int ycollege) {
		this.ycollege = ycollege;
	}

	/**
	 * @param ycollege
	 */
	public College(int ycollege) {
		super();
		this.ycollege = ycollege;
	}

	/**
	 * 
	 */
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [ycollege=" + ycollege + "]";
	}
	
	
}
