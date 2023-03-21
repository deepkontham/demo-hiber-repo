package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue(value ="Renalto_dt")

public class RenaltoCar extends Vehicle {
	@Column
	private String R_model;
	@Column
	private String Company;



	public RenaltoCar() {
		
	}

	public RenaltoCar( String v_name, String v_type,String R_model,String Company) {
		super( v_name, v_type);
		this.R_model=R_model;
		this.Company=Company;
		// TODO Auto-generated constructor stub

	}
	public String getR_model() {
		return R_model;
	}

	public void setR_model(String r_model) {
		R_model = r_model;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}
	
	@Override
	public String toString() {
		return "RenaltoCar [R_model=" + R_model + ", Company=" + Company + "]"+super.toString();
	}

}
