package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geofence_details", schema="public")
public class GeoFenceModel {
	
	@Id
	@Column(name = "id") 
    private String ID;
	
	@Column(name = "latitude") 
	private Float latitude; 
	
	@Column(name = "longitude") 
	private Float longigtude;
	
	@Column(name = "radius") 
	private Float radius;
	
	//@Column(name = "Student_name") 
	private String name;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongigtude() {
		return longigtude;
	}

	public void setLongigtude(Float longigtude) {
		this.longigtude = longigtude;
	}

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
