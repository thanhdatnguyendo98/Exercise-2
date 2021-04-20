package com.example.demo;

public class StudentBean {

	/**
	 * 
	 */
	private String name;
	private float rs1, rs2, rs3, GPA=(rs1+rs2+rs3)/3;

	public StudentBean() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @param name
	 * @param rs1
	 * @param rs2
	 * @param rs3
	 * @param gPA
	 */
	public StudentBean(String name, float rs1, float rs2, float rs3) {
		super();
		this.name = name;
		this.rs1 = rs1;
		this.rs2 = rs2;
		this.rs3 = rs3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRs1() {
		return rs1;
	}

	public void setRs1(float rs1) {
		this.rs1 = rs1;
	}

	public float getRs2() {
		return rs2;
	}

	public void setRs2(float rs2) {
		this.rs2 = rs2;
	}

	public float getRs3() {
		return rs3;
	}

	public void setRs3(float rs3) {
		this.rs3 = rs3;
	}

	public float getGPA() {
		return (rs1 + rs2 + rs3) / 3;
	}

	public void setGPA(float GPA) {
		this.GPA = GPA;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "\t rs1=" + rs1 + "\t rs2=" + rs2 + "\t rs3=" + rs3 + "\t GPA=" + (rs1+rs2+rs3)/3 +"]";
	}

}
