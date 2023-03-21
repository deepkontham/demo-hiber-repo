package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue(value ="Mahendra_db")

public class MahedhraCar extends Vehicle {
	@Column
	private String C_model;
	@Column
	private int C_tyres;

	public MahedhraCar() {

	}

	public MahedhraCar(String v_name, String v_type, String C_model, int C_tyres) {
		super(v_name, v_type);
		this.C_model = C_model;
		this.C_tyres = C_tyres;
		// TODO Auto-generated constructor stub
	}

	public String getC_model() {
		return C_model;
	}

	public void setC_model(String c_model) {
		C_model = c_model;
	}

	public int getC_tyres() {
		return C_tyres;
	}

	public void setC_tyres(int c_tyres) {
		C_tyres = c_tyres;
	}

	@Override
	public String toString() {
		return "MahedhraCar [C_model=" + C_model + ", C_tyres=" + C_tyres + "]" + super.toString();
	}
}
