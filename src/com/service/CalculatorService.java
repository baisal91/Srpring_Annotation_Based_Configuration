package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.beans.InterestCalculator;



@Service(value = "service")
public class CalculatorService {
	
	private InterestCalculator ic;
	
	
	public CalculatorService() {
		System.out.println("CalcultorServices");
	}
	
	public InterestCalculator getIc() {
		return ic;
	}
	
//	@Required
	@Autowired
	@Qualifier(value = "sa")
	public void setIc(InterestCalculator ic) {
		this.ic=ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("in init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
