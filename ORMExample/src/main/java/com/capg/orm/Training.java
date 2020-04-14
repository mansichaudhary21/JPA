package com.capg.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Training {

	@Id
	private int trainingId;
	private String trainingName;
	private int availableSeats;
	
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(int trainingId, String trainingName, int availableSeats) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.availableSeats = availableSeats;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", trainingName=" + trainingName + ", availableSeats="
				+ availableSeats + "]";
	}
}
