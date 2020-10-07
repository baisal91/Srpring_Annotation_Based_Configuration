package com.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


@Component(value = "sa")
public class SavingAccount implements InterestCalculator {
	
	private double roi;
	private int duration;
	
	public SavingAccount() {
		System.out.println("SavingingAccount");
	}
	
	
	public double getRoi() {
		return roi;
	}
//	@Required
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public int getDuration() {
		return duration;
	}
//	@Required
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount * roi / duration;
	}

}
